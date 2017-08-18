package kodluyoruz.com.listview00gkhn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lstListe;

    String[] meyveler = new String[]{"Armut", "Elma", "Karpuz", "Çilek", "Portakal", "Şeftali", "Kavun",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }


    private void init() {
        lstListe = (ListView) findViewById(R.id.activity_main_lstListe);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, meyveler);

        lstListe.setAdapter(adapter);

        //Tıklama Olayı

        lstListe.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pozisyon, long l) {
        Toast.makeText(this, "Seçilen Öğe:" + meyveler[pozisyon], Toast.LENGTH_LONG).show();

    }
}
