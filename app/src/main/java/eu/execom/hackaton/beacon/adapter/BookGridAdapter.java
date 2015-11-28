package eu.execom.hackaton.beacon.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import eu.execom.hackaton.beacon.R;
import eu.execom.hackaton.beacon.model.Book;
import eu.execom.hackaton.beacon.model.Location;

@EBean
public class BookGridAdapter extends BaseAdapter {

    private List<Book> books = new ArrayList<>();

    @RootContext
    Context context;

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Book getItem(int position) {
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BookItemView bookItemView;
        if (convertView == null) {
           bookItemView = BookGridAdapter_.BookItemView_.build(context);
        } else {
            bookItemView = (BookItemView) convertView;
        }
       bookItemView.bind(getItem(position));
        return bookItemView;
    }

    public void update(List<Book> books) {
        this.books.clear();
        this.books.addAll(books);
        notifyDataSetChanged();
    }

    @EViewGroup(R.layout.item_book)
    public static class BookItemView extends LinearLayout {

        @ViewById
        TextView name;

        @ViewById
        ImageView thumb;

        public BookItemView(Context context) {

            super(context);
        }

        public void bind(Book book) {
            name.setText(book.getTitle());

                            }

    }

}
