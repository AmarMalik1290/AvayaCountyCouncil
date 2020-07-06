package com.example.avayacountycouncil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.avayacountycouncil.config.Config;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;

import java.math.BigDecimal;

public class PayPalActivity extends AppCompatActivity {

    public static final int PAYPAL_REQUEST_CODE = 7171;

    private static PayPalConfiguration config = new PayPalConfiguration()
            .environment(PayPalConfiguration.ENVIRONMENT_SANDBOX) // use sandbox so i can test//
            .clientId(Config.PAYPAL_CLIENT_ID);


    Button ButtonPayNow;
    EditText editAmount;

    String amount = "";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_pal);

        //START PAYPAL SERVICE
        Intent intent = new Intent(this,PayPalService.class);
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION,config);
        startService(intent);



        ButtonPayNow = (Button) findViewById(R.id.ButtonPayNow);
        editAmount = (EditText) findViewById(R.id.editAmount);

        ButtonPayNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processPayment();

            }
        });
    }

    private void processPayment() {
     //   amount = editAmount.getText().toString();
      //  PayPalPayment payPalPayment = new PayPalPayment(new BigDecimal((String.valueOf(amount)),"USD",
       //         "Donate Now",PayPalPayment.PAYMENT_INTENT_SALE);
      // Intent intent = new Intent(this, PayPalPayment.class);
       // intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION,config);
      //  intent.putExtra(PaymentActivity.EXTRA_PAYMENT,payPalPayment);
      //  startActivity(intent,PAYPAL_REQUEST_CODE);

    }
}

