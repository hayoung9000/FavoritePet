package emirim0223.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,View.OnClickListener{
    CheckBox checkselect;
    TextView textQuest;
    RadioGroup rg;
    RadioButton radioDog, radioFox, radioChick;
    Button butOk;
    ImageView imgvPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkselect=(CheckBox)findViewById(R.id.check_select);
        textQuest=(TextView)findViewById(R.id.text_quest);
        rg=(RadioGroup) findViewById(R.id.rg);
        radioDog=(RadioButton) findViewById(R.id.radio_dog);
        radioFox=(RadioButton) findViewById(R.id.radio_fox);
        radioChick=(RadioButton) findViewById(R.id.radio_chick);
        butOk=(Button) findViewById(R.id.but_ok);
        imgvPet=(ImageView) findViewById(R.id.imgv_pet);
        checkselect.setOnCheckedChangeListener(this);
        butOk.setOnClickListener(this);
    } //end onCreate

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(checkselect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }
        else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onClick(View view) {
        switch (rg.getCheckedRadioButtonId()){ //선택된 라디오 버튼 아이디를 얻는다
            case R.id.radio_dog :
                imgvPet.setImageResource(R.drawable.puppy);
                break;
            case R.id.radio_fox :
                imgvPet.setImageResource(R.drawable.fox);
                break;
            case R.id.radio_chick :
                imgvPet.setImageResource(R.drawable.chick);
                break;
            default:
                Toast.makeText(this,"라디오버튼이 선택이 안되었네요.",Toast.LENGTH_SHORT).show();
        }
    }
}
