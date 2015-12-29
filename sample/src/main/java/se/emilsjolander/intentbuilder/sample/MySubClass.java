package se.emilsjolander.intentbuilder.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.ArrayList;

import se.emilsjolander.intentbuilder.Extra;
import se.emilsjolander.intentbuilder.IntentBuilder;

@IntentBuilder
public class MySubClass extends MySuperClass {

    @Extra @Nullable
    String three;

    @Extra @Nullable
    String four;

    @Extra
    int five;

    @Extra
    ArrayList<String> six;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MySubClassIntentBuilder.inject(getIntent(), this);
    }

}
