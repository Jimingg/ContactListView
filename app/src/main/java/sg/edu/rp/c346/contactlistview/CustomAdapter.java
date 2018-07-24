package sg.edu.rp.c346.contactlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010144 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<Contacts> ContactList;
    public CustomAdapter(@NonNull Context context, int resource,  @NonNull ArrayList<Contacts> objects) {
        super(context, resource, objects);
        parent_context=context;
        layout_id=resource;
        ContactList=objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.TextViewname);
        TextView tvcd = rowView.findViewById(R.id.textViewCode);
        TextView tvnumber=rowView.findViewById(R.id.textViewnumber);
        Contacts currentItem = ContactList.get(position);
        String name = currentItem.getName();
        int code = currentItem.getCountryCode();
        int number=currentItem.getPhoneNum();
        tvName.setText(name);
        tvcd.setText(code+"");
        tvnumber.setText(number+"");
        return rowView;
    }
}