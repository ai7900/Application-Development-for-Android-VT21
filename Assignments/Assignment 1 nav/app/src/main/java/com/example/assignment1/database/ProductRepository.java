package com.example.assignment1.database;

import android.os.AsyncTask;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class ProductRepository {

    private MutableLiveData<List<Product>> searchResults = new MutableLiveData<>();

    private void asyncFinished(List<Product> results){
        searchResults.setValue(results);
    }

    private static class QueryAsyncTask extends AsyncTask<String, Void, List<Product>> {
        private ProductDao asyncTaskDao;
        private ProductRepository delegate = null;

        QueryAsyncTask(ProductDao dao){
            asyncTaskDao = dao;
        }

        @Override
        protected List<Product> doInBackground(final String... params) {
            return asyncTaskDao.findProduct(params[0]);
        }

        @Override
        protected void onPostExecute(List<Product> result){
            delegate.asyncFinished(result);
        }
    }

    private static class InsertAsyncTask extends AsyncTask<Product, Void, Void>{
        private ProductDao asyncTaskDao;

        InsertAsyncTask(ProductDao dao){
            asyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Product... params){
            asyncTaskDao.insertProduct(params[0]);
            return null;
        }
    }

    private static class DeleteAsyncTask extends AsyncTask<String, Void, Void>{

        private ProductDao asyncTaskDao;

        DeleteAsyncTask(ProductDao dao){
            asyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final String... params){
            asyncTaskDao.deleteProduct(params[0]);
            return null;
        }

    }

}
