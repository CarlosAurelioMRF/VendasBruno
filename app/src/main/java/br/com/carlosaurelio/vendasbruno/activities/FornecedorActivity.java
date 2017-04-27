package br.com.carlosaurelio.vendasbruno.activities;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import br.com.carlosaurelio.vendasbruno.R;

public class FornecedorActivity extends AppCompatActivity {

    private EditText edtCodigoFornecedor, edtNomeCompanhiaFornecedor, edtNomeContatoFornecedor, edtTituloFornecedor,
            edtEnderecoFornecedor, edtBairroFornecedor, edtCidadeFornecedor, edtCepFornecedor, edtPaisFornecedor,
            edtTelefoneFornecedor, edtFaxFornecedor, edtSiteFornecedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fornecedor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edtCodigoFornecedor = (EditText) findViewById(R.id.edtCodigoFornecedor);
        edtNomeCompanhiaFornecedor = (EditText) findViewById(R.id.edtNomeCompanhiaFornecedor);
        edtNomeContatoFornecedor = (EditText) findViewById(R.id.edtNomeContatoFornecedor);
        edtTituloFornecedor = (EditText) findViewById(R.id.edtTituloFornecedor);
        edtEnderecoFornecedor = (EditText) findViewById(R.id.edtEnderecoFornecedor);
        edtBairroFornecedor = (EditText) findViewById(R.id.edtBairroFornecedor);
        edtCidadeFornecedor = (EditText) findViewById(R.id.edtCidadeFornecedor);
        edtCepFornecedor = (EditText) findViewById(R.id.edtCepFornecedor);
        edtPaisFornecedor = (EditText) findViewById(R.id.edtPaisFornecedor);
        edtTelefoneFornecedor = (EditText) findViewById(R.id.edtTelefoneFornecedor);
        edtFaxFornecedor = (EditText) findViewById(R.id.edtFaxFornecedor);
        edtSiteFornecedor = (EditText) findViewById(R.id.edtSiteFornecedor);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickSalvarFornecedor(View view) {
        if (edtCodigoFornecedor.getText().toString().trim().equals("")) {
            TextInputLayout lCodigoFornecedor = (TextInputLayout) findViewById(R.id.lCodigoFornecedor);
            lCodigoFornecedor.setErrorEnabled(true);
            lCodigoFornecedor.setError("Preencha o campo código.");
            edtCodigoFornecedor.setError("Obrigatório");
            edtCodigoFornecedor.requestFocus();
        } else if (edtNomeCompanhiaFornecedor.getText().toString().trim().equals("")) {
            TextInputLayout lNomeCompanhia = (TextInputLayout) findViewById(R.id.lNomeCompanhia);
            lNomeCompanhia.setErrorEnabled(true);
            lNomeCompanhia.setError("Preencha o campo nome companhia.");
            edtNomeCompanhiaFornecedor.setError("Obrigatório");
            edtNomeCompanhiaFornecedor.requestFocus();
        } else if (edtNomeContatoFornecedor.getText().toString().trim().equals("")) {
            TextInputLayout lNomeContatoFornecedor = (TextInputLayout) findViewById(R.id.lNomeContatoFornecedor);
            lNomeContatoFornecedor.setErrorEnabled(true);
            lNomeContatoFornecedor.setError("Preencha o campo nome de contato.");
            edtNomeContatoFornecedor.setError("Obrigatório");
            edtNomeContatoFornecedor.requestFocus();
        } else if (edtEnderecoFornecedor.getText().toString().trim().equals("")) {
            TextInputLayout lEnderecoFornecedor = (TextInputLayout) findViewById(R.id.lEnderecoFornecedor);
            lEnderecoFornecedor.setErrorEnabled(true);
            lEnderecoFornecedor.setError("Preencha o campo endereço.");
            edtEnderecoFornecedor.setError("Obrigatório");
            edtEnderecoFornecedor.requestFocus();
        } else if (edtCidadeFornecedor.getText().toString().trim().equals("")) {
            TextInputLayout lCidadeFornecedor = (TextInputLayout) findViewById(R.id.lCidadeFornecedor);
            lCidadeFornecedor.setErrorEnabled(true);
            lCidadeFornecedor.setError("Preencha o campo cidade.");
            edtCidadeFornecedor.setError("Obrigatório");
            edtCidadeFornecedor.requestFocus();
        } else if (edtTelefoneFornecedor.getText().toString().trim().equals("")) {
            TextInputLayout lTelefoneFornecedor = (TextInputLayout) findViewById(R.id.lTelefoneFornecedor);
            lTelefoneFornecedor.setErrorEnabled(true);
            lTelefoneFornecedor.setError("Preencha o campo telefone.");
            edtTelefoneFornecedor.setError("Obrigatório");
            edtTelefoneFornecedor.requestFocus();
        } else {

        }
    }

}
