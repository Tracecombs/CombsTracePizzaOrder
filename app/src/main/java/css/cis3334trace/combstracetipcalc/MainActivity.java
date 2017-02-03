package css.cis3334trace.combstracetipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare variables here

    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing variables

        etBill = (EditText) findViewById(R.id.editTextBill);
        etNumParty = (EditText) findViewById(R.id.editTextNumParty);
        tvTotalTip = (TextView) findViewById(R.id.textViewTotalTip);
        tvTipPerPerson = (TextView) findViewById(R.id.textViewTipPerPerson);
    }

    public void OnClickButtonCalc(View view) {

        double bill = Double.parseDouble(etBill.getText().toString());
        int people = Integer.parseInt(etNumParty.getText().toString());
        tvTotalTip.setText("total bill: " + ((bill *1.10)) );
        tvTipPerPerson.setText("total bill: " + (((bill *1.10) / people)) );
    }



    }
