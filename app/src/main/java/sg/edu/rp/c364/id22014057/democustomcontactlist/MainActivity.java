package sg.edu.rp.c364.id22014057.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;

    public MainActivity(ListView lvContact, ArrayList<Contact> alContactList, CustomAdapter caContact) {
        this.lvContact = lvContact;
        this.alContactList = alContactList;
        this.caContact = caContact;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        alContactList.add(item1);

        Contact item2 = new Contact("Ken", 65, 97442437, 'M');
        alContactList.add(item2);

        caContact = new CustomAdapter(this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);

       // String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        //Picasso.with(this).load(imageUrl).into(iv);

    }
}
