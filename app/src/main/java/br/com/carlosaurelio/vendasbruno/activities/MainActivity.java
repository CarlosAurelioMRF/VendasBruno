package br.com.carlosaurelio.vendasbruno.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import br.com.carlosaurelio.vendasbruno.R;
import br.com.carlosaurelio.vendasbruno.util.SaveSharedPreference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (SaveSharedPreference.getUserName(MainActivity.this).length() == 0) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        } else {
            setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.btnSair) {
            SaveSharedPreference.clearUserName(MainActivity.this);
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClickCategoria(View view) {
        Intent intent = new Intent(this, CategoriaActivity.class);
        startActivity(intent);
    }

    public void onClickTransportadora(View view) {
        Intent intent = new Intent(this, TransportadoraActivity.class);
        startActivity(intent);
    }

    public void onClickProdutos(View view) {
        Intent intent = new Intent(this, ProdutoActivity.class);
        startActivity(intent);
    }

    public void onClickCliente(View view) {
        Intent intent = new Intent(this, ClienteActivity.class);
        startActivity(intent);
    }

    public void onClickFornecedor(View view) {
        Intent intent = new Intent(this, FornecedorActivity.class);
        startActivity(intent);
    }

    public void onClickFuncionario(View view) {
        Intent intent = new Intent(this, FuncionarioActivity.class);
        startActivity(intent);
    }
}
