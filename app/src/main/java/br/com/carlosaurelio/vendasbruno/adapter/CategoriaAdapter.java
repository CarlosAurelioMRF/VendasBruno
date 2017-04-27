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
import br.com.carlosaurelio.vendasbruno.entities.Category;

/**
 * Created by Carlos Aurelio on 26/09/2016.
 */

public class CategoriaAdapter extends BaseAdapter {

    private ArrayList<Category> mListaCategoria = new ArrayList<Category>();
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public CategoriaAdapter(Context context, ArrayList<Category> categoryList) {
        this.mContext = context;
        this.mListaCategoria = categoryList;
        this.mLayoutInflater = LayoutInflater.from(this.mContext);
    }

    @Override
    public int getCount() {
        return mListaCategoria.size();
    }

    @Override
    public Category getItem(int position) {
        return mListaCategoria.get(position);
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

        Category category = getItem(position);

        viewHolder.txtTitulo.setText(String.format("#%d - %s", category.getCategoryID(), category.getCategoryName()));
        viewHolder.txtSubtitulo.setText(category.getDescription());
        viewHolder.imgIcon.setImageResource(R.drawable.ic_found);

        viewHolder.btnDeletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListaCategoria.remove(position);
                CategoriaAdapter.this.notifyDataSetChanged();
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
