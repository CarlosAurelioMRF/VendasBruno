package br.com.carlosaurelio.vendasbruno.activities;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.carlosaurelio.vendasbruno.R;
import br.com.carlosaurelio.vendasbruno.adapter.CategoriaAdapter;
import br.com.carlosaurelio.vendasbruno.entities.Category;

public class CategoriaActivity extends AppCompatActivity {

    private EditText edtCategoryId;
    private EditText edtCategoryName;
    private EditText edtCategoryDescription;
    private ListView lvDetail;
    private ArrayList<Category> mCategories = new ArrayList<Category>();
    private CategoriaAdapter categoriaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edtCategoryId = (EditText) findViewById(R.id.edtCategoryId);
        edtCategoryName = (EditText) findViewById(R.id.edtCategoryName);
        edtCategoryDescription = (EditText) findViewById(R.id.edtDescription);

        lvDetail = (ListView) findViewById(R.id.lvCustomList);
        categoriaAdapter = new CategoriaAdapter(getApplicationContext(), mCategories);
        lvDetail.setAdapter(categoriaAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickSalvarCategoria(View view) {
        if (edtCategoryId.getText().toString().trim().equals("")) {
            TextInputLayout lCodigoCategoria = (TextInputLayout) findViewById(R.id.lCodigoCategoria);
            lCodigoCategoria.setErrorEnabled(true);
            lCodigoCategoria.setError("Preencha o campo código.");
            edtCategoryId.setError("Obrigatório");
            edtCategoryId.requestFocus();
        } else if (edtCategoryName.getText().toString().trim().equals("")) {
            TextInputLayout lNomeCategoria = (TextInputLayout) findViewById(R.id.lNomeCategoria);
            lNomeCategoria.setErrorEnabled(true);
            lNomeCategoria.setError("Preencha o campo nome.");
            edtCategoryName.setError("Obrigatório");
            edtCategoryName.requestFocus();
        } else if (edtCategoryDescription.getText().toString().trim().equals("")) {
            TextInputLayout lDescricaoCategoria = (TextInputLayout) findViewById(R.id.lDescricaoCategoria);
            lDescricaoCategoria.setErrorEnabled(true);
            lDescricaoCategoria.setError("Preencha o campo descrição.");
            edtCategoryDescription.setError("Obrigatório");
            edtCategoryDescription.requestFocus();
        } else {
            int mCategoryID = Integer.parseInt(edtCategoryId.getText().toString());
            String mCategoryName = edtCategoryName.getText().toString();
            String mCategoryDescription = edtCategoryDescription.getText().toString();
            Category category = new Category(mCategoryID, mCategoryName, mCategoryDescription);
            mCategories.add(category);
            categoriaAdapter.notifyDataSetChanged();
        }
    }

}
