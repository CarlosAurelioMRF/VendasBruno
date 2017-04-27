package br.com.carlosaurelio.vendasbruno.activities;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import br.com.carlosaurelio.vendasbruno.R;

public class ClienteActivity extends AppCompatActivity {

    private EditText edtCodigoCliente, edtNomeCompanhia, edtNomeContatoCliente, edtTituloCliente,
            edtEnderecoCliente, edtBairroCliente, edtCidadeCliente, edtCepCliente, edtPaisCliente,
            edtTelefoneCliente, edtFaxCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edtCodigoCliente = (EditText) findViewById(R.id.edtCodigoCliente);
        edtNomeCompanhia = (EditText) findViewById(R.id.edtNomeCompanhia);
        edtNomeContatoCliente = (EditText) findViewById(R.id.edtNomeContatoCliente);
        edtTituloCliente = (EditText) findViewById(R.id.edtTituloCliente);
        edtEnderecoCliente = (EditText) findViewById(R.id.edtEnderecoCliente);
        edtBairroCliente = (EditText) findViewById(R.id.edtBairroCliente);
        edtCidadeCliente = (EditText) findViewById(R.id.edtCidadeCliente);
        edtCepCliente = (EditText) findViewById(R.id.edtCepCliente);
        edtPaisCliente = (EditText) findViewById(R.id.edtPaisCliente);
        edtTelefoneCliente = (EditText) findViewById(R.id.edtTelefoneCliente);
        edtFaxCliente = (EditText) findViewById(R.id.edtFaxCliente);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickSalvarCliente(View view) {
        if (edtCodigoCliente.getText().toString().trim().equals("")) {
            TextInputLayout lCodigoCliente = (TextInputLayout) findViewById(R.id.lCodigoCliente);
            lCodigoCliente.setErrorEnabled(true);
            lCodigoCliente.setError("Preencha o campo código.");
            edtCodigoCliente.setError("Obrigatório");
            edtCodigoCliente.requestFocus();
        } else if (edtNomeCompanhia.getText().toString().trim().equals("")) {
            TextInputLayout lNomeCompanhia = (TextInputLayout) findViewById(R.id.lNomeCompanhia);
            lNomeCompanhia.setErrorEnabled(true);
            lNomeCompanhia.setError("Preencha o campo nome companhia.");
            edtNomeCompanhia.setError("Obrigatório");
            edtNomeCompanhia.requestFocus();
        } else if (edtNomeContatoCliente.getText().toString().trim().equals("")) {
            TextInputLayout lNomeContatoCliente = (TextInputLayout) findViewById(R.id.lNomeContatoCliente);
            lNomeContatoCliente.setErrorEnabled(true);
            lNomeContatoCliente.setError("Preencha o campo nome de contato.");
            edtNomeContatoCliente.setError("Obrigatório");
            edtNomeContatoCliente.requestFocus();
        } else if (edtEnderecoCliente.getText().toString().trim().equals("")) {
            TextInputLayout lEnderecoCliente = (TextInputLayout) findViewById(R.id.lEnderecoCliente);
            lEnderecoCliente.setErrorEnabled(true);
            lEnderecoCliente.setError("Preencha o campo endereço.");
            edtEnderecoCliente.setError("Obrigatório");
            edtEnderecoCliente.requestFocus();
        } else if (edtCidadeCliente.getText().toString().trim().equals("")) {
            TextInputLayout lCidadeCliente = (TextInputLayout) findViewById(R.id.lCidadeCliente);
            lCidadeCliente.setErrorEnabled(true);
            lCidadeCliente.setError("Preencha o campo cidade.");
            edtCidadeCliente.setError("Obrigatório");
            edtCidadeCliente.requestFocus();
        } else if (edtTelefoneCliente.getText().toString().trim().equals("")) {
            TextInputLayout lTelefoneCliente = (TextInputLayout) findViewById(R.id.lTelefoneCliente);
            lTelefoneCliente.setErrorEnabled(true);
            lTelefoneCliente.setError("Preencha o campo telefone.");
            edtTelefoneCliente.setError("Obrigatório");
            edtTelefoneCliente.requestFocus();
        } else {

        }
    }

}
