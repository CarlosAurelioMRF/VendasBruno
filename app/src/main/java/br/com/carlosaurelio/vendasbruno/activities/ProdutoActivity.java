package br.com.carlosaurelio.vendasbruno.activities;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;

import br.com.carlosaurelio.vendasbruno.R;

public class ProdutoActivity extends AppCompatActivity {

    private EditText edtCodigoProduto, edtNomeProduto, edtQuantidadeProduto, edtQuantidadeEstoqueProduto,
            edtQuantidadeOrdemProduto, edtPrecoProduto, edtNivelReabastecimento, edtProdutoAtivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edtCodigoProduto = (EditText) findViewById(R.id.edtCodigoProduto);
        edtNomeProduto = (EditText) findViewById(R.id.edtNomeProduto);
        edtQuantidadeProduto = (EditText) findViewById(R.id.edtQuantidadeProduto);
        edtQuantidadeEstoqueProduto = (EditText) findViewById(R.id.edtQuantidadeEstoqueProduto);
        edtQuantidadeOrdemProduto = (EditText) findViewById(R.id.edtQuantidadeOrdemProduto);
        edtPrecoProduto = (EditText) findViewById(R.id.edtPrecoProduto);
        edtNivelReabastecimento = (EditText) findViewById(R.id.edtNivelReabastecimento);
        edtProdutoAtivo = (EditText) findViewById(R.id.edtProdutoAtivo);

        edtPrecoProduto.addTextChangedListener(new MascaraMonetaria(edtPrecoProduto));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickSalvarProduto(View view) {
        if (edtCodigoProduto.getText().toString().trim().equals("")) {
            TextInputLayout lCodigoPrdotuo = (TextInputLayout) findViewById(R.id.lCodigoPrdotuo);
            lCodigoPrdotuo.setErrorEnabled(true);
            lCodigoPrdotuo.setError("Preencha o campo código.");
            edtCodigoProduto.setError("Obrigatório");
            edtCodigoProduto.requestFocus();
        } else if (edtNomeProduto.getText().toString().trim().equals("")) {
            TextInputLayout lNomeProduto = (TextInputLayout) findViewById(R.id.lNomeProduto);
            lNomeProduto.setErrorEnabled(true);
            lNomeProduto.setError("Preencha o campo nome.");
            edtNomeProduto.setError("Obrigatório");
            edtNomeProduto.requestFocus();
        } else if (edtQuantidadeProduto.getText().toString().trim().equals("")) {
            TextInputLayout lQuantidade = (TextInputLayout) findViewById(R.id.lQuantidade);
            lQuantidade.setErrorEnabled(true);
            lQuantidade.setError("Preencha o campo quantidade.");
            edtQuantidadeProduto.setError("Obrigatório");
            edtQuantidadeProduto.requestFocus();
        } else if (edtQuantidadeEstoqueProduto.getText().toString().trim().equals("")) {
            TextInputLayout lQuantidadeEstoque = (TextInputLayout) findViewById(R.id.lQuantidadeEstoque);
            lQuantidadeEstoque.setErrorEnabled(true);
            lQuantidadeEstoque.setError("Preencha o campo quantidade estoque.");
            edtQuantidadeEstoqueProduto.setError("Obrigatório");
            edtQuantidadeEstoqueProduto.requestFocus();
        } else if (edtPrecoProduto.getText().toString().trim().equals("")) {
            TextInputLayout lPrecoProduto = (TextInputLayout) findViewById(R.id.lPrecoProduto);
            lPrecoProduto.setErrorEnabled(true);
            lPrecoProduto.setError("Preencha o campo preço.");
            edtPrecoProduto.setError("Obrigatório");
            edtPrecoProduto.requestFocus();
        } else {
            int mCodigoProduto = Integer.parseInt(edtCodigoProduto.getText().toString());
            String mNomeProduto = edtNomeProduto.getText().toString();
            String mQuantidadeProduto = edtQuantidadeProduto.getText().toString();

            String dados = String.format("Os seguintes dados foram salvos: \n ID: %d \n Nome: %s \n Quantidade: %s",
                    mCodigoProduto, mNomeProduto, mQuantidadeProduto);

            Toast.makeText(ProdutoActivity.this, dados, Toast.LENGTH_LONG).show();
            finish();
        }
    }

    private class MascaraMonetaria implements TextWatcher {

        final EditText edtCampo;
        private boolean isUpdating = false;
        private NumberFormat mNumberFormat = NumberFormat.getCurrencyInstance();

        private MascaraMonetaria(EditText campo) {
            super();
            edtCampo = campo;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (isUpdating) {
                isUpdating = false;
                return;
            }
            isUpdating = true;

            String str = s.toString();
            str = str.replaceAll("[^\\d]", "");

            try {
                // Transformamos o número que está escrito no EditText em
                // monetário.
                str = mNumberFormat.format(Double.parseDouble(str) / 100);
                edtCampo.setText(str);
                edtCampo.setSelection(edtCampo.getText().length());
            } catch (NumberFormatException e) {
                s = "";
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

}
