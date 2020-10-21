package de.hawlandshut.pluto21_ukw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "xx SignInActivity";

    // Deklaration der UI-Elemente
    EditText mEditTextEmail;
    EditText mEditTextPassword;
    Button mButtonSignIn;
    Button mButtonCreateAccount;
    Button mButtonResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Log.d(TAG, "onCreate called");
        // Initialisieren der UI Elemente
        mEditTextEmail = (EditText) findViewById( R.id.signInEmail);
        mEditTextPassword = (EditText) findViewById( R.id.signInPassword);
        mButtonSignIn = (Button)  findViewById( (R.id.signInButtonSignIn));
        mButtonCreateAccount = (Button)  findViewById( (R.id.signInButtonCreateAccount));
        mButtonResetPassword = (Button)  findViewById( (R.id.signInButtonResetPassword));

        // Listener setzen
        mButtonSignIn.setOnClickListener( this );
        mButtonResetPassword.setOnClickListener( this );
        mButtonCreateAccount.setOnClickListener( this );
    }

    @Override
    public void onClick( View v){
        switch( v.getId() ){

            case R.id.signInButtonCreateAccount:
                doCreateAccount();
                return;

            case R.id.signInButtonResetPassword:
                doResetPassword();
                return;

            case R.id.signInButtonSignIn:
                doSignIn();
                return;

            default:
                return;
        }
    }

    private void doSignIn() {
        Toast.makeText(getApplicationContext(), "You pressed SignIn (nyi).", Toast.LENGTH_LONG).show();
    }

    private void doResetPassword() {
        Toast.makeText(getApplicationContext(), "You pressed Reset Password (nyi).", Toast.LENGTH_LONG).show();
    }

    private void doCreateAccount() {
        Toast.makeText(getApplicationContext(), "You pressed Create Account (nyi).", Toast.LENGTH_LONG).show();
    }

}