package com.example.alaa.retrofiapiex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<calories> calories;
    private  RecyclerAdapter adapter;
    private ApiInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView= (RecyclerView) findViewById(R.id.recycleview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        if(getIntent().getExtras()!=null)
        {
            String type=getIntent().getExtras().getString("type");
            fetchInformation(type);
        }
    }

    private void fetchInformation(String type) {
      apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<calories>> call=apiInterface.getCaloriesInfo(type);
        call.enqueue(new Callback<List<calories>>() {
                         @Override
                         public void onResponse(Call<List<calories>> call, Response<List<calories>> response) {
                             calories=response.body();
                             adapter=new RecyclerAdapter(calories,ListActivity.this);
                             recyclerView.setAdapter(adapter);
                             Toast.makeText(getApplicationContext(), " On Success message!",
                                     Toast.LENGTH_LONG).show();
                         }

                         @Override
                         public void onFailure(Call<List<calories>> call, Throwable t) {

                             Toast.makeText(getApplicationContext(), " On Failure message!",
                                     Toast.LENGTH_LONG).show();
                         }
                     }

        );

    }
}
