package sg.edu.rp.c346.contactlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvcontacts;
    ArrayList<Contacts> alcontactList;
    CustomAdapter cacontacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvcontacts=findViewById(R.id.ListViewContacts);
        alcontactList=new ArrayList<>();
        Contacts item1 = new Contacts("Mary",+65,65442334);
        Contacts item2 = new Contacts("Ken",+65,97442437);
        alcontactList.add(item1);
        alcontactList.add(item2);

        cacontacts= new CustomAdapter(this,R.layout.contact_item,alcontactList);
        lvcontacts.setAdapter(cacontacts);
    }
}
