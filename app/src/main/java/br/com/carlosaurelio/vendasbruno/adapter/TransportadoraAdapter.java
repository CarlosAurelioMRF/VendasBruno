package br.com.carlosaurelio.vendasbruno.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.carlosaurelio.vendasbruno.R;
import br.com.carlosaurelio.vendasbruno.entities.Shipper;

/**
 * Created by Carlos Aurelio on 27/09/2016.
 */

public class TransportadoraAdapter extends BaseAdapter {

    private ArrayList<Shipper> mListaTransportadora= new ArrayList<Shipper>();
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public TransportadoraAdapter(Context context, ArrayList<Shipper> listaTransportadora) {
        this.mListaTransportadora = listaTransportadora;
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(this.mContext);
    }

    @Override
    public int getCount() {
        return mListaTransportadora.size();
    }

    @Override
    public Shipper getItem(int position) {
        return mListaTransportadora.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.lista_customizada, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Shipper shipper = getItem(position);

        viewHolder.txtTitulo.setText(String.format("#%d - %s", shipper.getShipperID(), shipper.getCompanyName()));
        viewHolder.txtSubtitulo.setText(shipper.getPhone());
        viewHolder.imgIcon.setImageResource(R.drawable.ic_found);

        viewHolder.btnDeletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListaTransportadora.remove(position);
                TransportadoraAdapter.this.notifyDataSetChanged();
            }
        });

        return convertView;
    }

    private class ViewHolder {
        private TextView txtTitulo, txtSubtitulo;
        private ImageView imgIcon;
        private Button btnDeletar;

        public ViewHolder(View view) {
            txtTitulo = (TextView) view.findViewById(R.id.titulo);
            txtSubtitulo = (TextView) view.findViewById(R.id.subtitulo);
            imgIcon = (ImageView) view.findViewById(R.id.image);
            btnDeletar = (Button) view.findViewById(R.id.button);
        }
    }
}
