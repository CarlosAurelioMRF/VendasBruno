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
import br.com.carlosaurelio.vendasbruno.adapter.TransportadoraAdapter;
import br.com.carlosaurelio.vendasbruno.entities.Shipper;

public class TransportadoraActivity extends AppCompatActivity {

    private EditText edtShipperId;
    private EditText edtShipperName;
    private EditText edtShipperPhone;
    private ListView lvDetail;
    private ArrayList<Shipper> mShippers = new ArrayList<Shipper>();
    private TransportadoraAdapter mTransportadoraAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportadora);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edtShipperId = (EditText) findViewById(R.id.edtShipperId);
        edtShipperName = (EditText) findViewById(R.id.edtShipperName);
        edtShipperPhone = (EditText) findViewById(R.id.edtShipperPhone);

        lvDetail = (ListView) findViewById(R.id.lvCustomList);
        mTransportadoraAdapter = new TransportadoraAdapter(getApplicationContext(), mShippers);
        lvDetail.setAdapter(mTransportadoraAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickSalvarTransportadora(View view) {
        if (edtShipperId.getText().toString().trim().equals("")) {
            TextInputLayout lCodigoTransportadora = (TextInputLayout) findViewById(R.id.lCodigoTransportadora);
            lCodigoTransportadora.setErrorEnabled(true);
            lCodigoTransportadora.setError("Preencha o campo código.");
            edtShipperId.setError("Obrigatório");
            edtShipperId.requestFocus();
        } else if (edtShipperName.getText().toString().trim().equals("")) {
            TextInputLayout lNomeTransportadora = (TextInputLayout) findViewById(R.id.lNomeTransportadora);
            lNomeTransportadora.setErrorEnabled(true);
            lNomeTransportadora.setError("Preencha o campo nome.");
            edtShipperName.setError("Obrigatório");
            edtShipperName.requestFocus();
        } else if (edtShipperPhone.getText().toString().trim().equals("")) {
            TextInputLayout lTelefoneTransportadora = (TextInputLayout) findViewById(R.id.lTelefoneTransportadora);
            lTelefoneTransportadora.setErrorEnabled(true);
            lTelefoneTransportadora.setError("Preencha o campo telefone.");
            edtShipperPhone.setError("Obrigatório");
            edtShipperPhone.requestFocus();
        } else {
            int mShipperID = Integer.parseInt(edtShipperId.getText().toString());
            String mShipperName = edtShipperName.getText().toString();
            String mShipperPhone = edtShipperPhone.getText().toString();

            Shipper shipper = new Shipper(mShipperID, mShipperName, mShipperPhone);

            mShippers.add(shipper);
            mTransportadoraAdapter.notifyDataSetChanged();
        }
    }

}
