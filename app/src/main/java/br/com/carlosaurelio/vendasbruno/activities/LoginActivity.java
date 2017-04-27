package br.com.carlosaurelio.vendasbruno.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.carlosaurelio.vendasbruno.R;
import br.com.carlosaurelio.vendasbruno.util.SaveSharedPreference;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUsuario, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
    }

    public void validar(View view) {
        if (edtUsuario.getText().toString().trim().equals("")) {
            TextInputLayout lNomeUsuarioLayout = (TextInputLayout) findViewById(R.id.lNomeUsuarioLayout);
            lNomeUsuarioLayout.setErrorEnabled(true);
            lNomeUsuarioLayout.setError("Preencha o campo usuário.");
            edtUsuario.setError("Obrigatório");
            edtUsuario.requestFocus();
        } else if (edtSenha.getText().toString().trim().equals("")) {
            TextInputLayout lPasswordLayout = (TextInputLayout) findViewById(R.id.lPasswordLayout);
            lPasswordLayout.setErrorEnabled(true);
            lPasswordLayout.setError("Preencha o campo senha.");
            edtSenha.setError("Obrigatório");
            edtSenha.requestFocus();
        } else {
            String usuario = edtUsuario.getText().toString();
            String senha = edtSenha.getText().toString();
            try {
                final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("Autenticando...");
                progressDialog.show();
                boolean isValid = (usuario.equals( "admin")) && (senha.equals( "admin"));
                if (isValid) {
                    SaveSharedPreference.setUserName(LoginActivity.this, usuario);
                    Intent intent = getIntent().setClass(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getBaseContext(), "Verifique usuário e senha!", Toast.LENGTH_LONG).show();
                }
            } catch (Exception e) {
                Toast.makeText(getBaseContext(), "Verifique usuário e senha!", Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
        }
    }
}
