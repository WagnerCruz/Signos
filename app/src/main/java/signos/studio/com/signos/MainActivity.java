package signos.studio.com.signos;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private TextView tv;
    private String[] signos = {"Aquario","Peixes","Áries",
                                "Touro","Gemeos","Cancer",
                                "Leão","Virgem","Libra",
                                "Escorpião","Sagitário","Capricórnio"};

    private String[] perfis = {"Os aquarianos são tímidos e quietos, mas por outro lado eles podem ser excêntricos e energéticos. No entanto, em ambos os casos, eles são profundos pensadores e pessoas altamente intelectuais que gostam de ajudar os outros.",
                                "Piscianos são muito simpáticos, então eles muitas vezes se encontram na companhia de pessoas muito diferentes",
                                "Como o primeiro signo do zodíaco, a presença de Áries quase sempre marca o início de algo enérgico e turbulento. Estas pessoas estão continuamente à procura de dinâmica, velocidade e competição. Elas estão sempre em primeiro lugar em tudo - do trabalho a encontros sociais.",
                                "Poderoso e confiável, Touro é o primeiro quando se trata de colher os frutos do seu trabalho. Eles adoram tudo o que é bom e belo, e eles vivem muitas vezes cercados por prazeres materiais.",
                                "Expressivo e de raciocínio rápido, Gêmeos representa dois lados diferentes da mesma personalidade e você nunca vai ter certeza de com quem você está falando.",
                                "Profundamente intuitivo e sentimental, o canceriano pode ser um dos signos do zodíaco mais desafiadores para entender. Câncer é muito emocional e sensível, e se preocupa com a família e a casa. É simpático e muito apegado às pessoas que o cercam. ",
                                "...",
                                "...",
                                "...",
                                "...",
                                "...",
                                "...",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.listaSignosID);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(), //Contexto da Aplicação
                android.R.layout.simple_list_item_1, //layout
                android.R.id.text1, //
                signos //lista de itens
        );


        listaSignos.setAdapter(adaptador);
        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                int codigoPosicao = position;

                Toast.makeText(MainActivity.this, signos[position], Toast.LENGTH_SHORT).show();

            }
        });


    }
}
