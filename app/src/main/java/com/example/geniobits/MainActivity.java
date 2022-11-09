package com.example.geniobits;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button retry,hint,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,check;
    TextView ans,level,coins;
    int coinsCount=0,levelCount=1,count=0;
    List<Pair> colours=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialise();
        working();
    }

    private void working() {
        //int i = (int)(Math.random()*(10-0+1)+0);
        imageView.setBackgroundColor(Color.parseColor(colours.get(count).code));
        String name=colours.get(count).name;
        List<String> characters = Arrays.asList(name.split(""));
        Collections.shuffle(characters);
        String afterShuffle = "";
        for (String character : characters)
            afterShuffle += character;
        int l=16-name.length();
        String generated=getAlphaNumericString(l);
        generated+=afterShuffle;
        List<String> finalcharacters = Arrays.asList(generated.split(""));
        Collections.shuffle(finalcharacters);
        String str = "";
        for (String character : finalcharacters)
            str += character;
        b1.setText(String.valueOf(str.charAt(0)));
        b2.setText(String.valueOf(str.charAt(1)));
        b3.setText(String.valueOf(str.charAt(2)));
        b4.setText(String.valueOf(str.charAt(3)));
        b5.setText(String.valueOf(str.charAt(4)));
        b6.setText(String.valueOf(str.charAt(5)));
        b7.setText(String.valueOf(str.charAt(6)));
        b8.setText(String.valueOf(str.charAt(7)));
        b9.setText(String.valueOf(str.charAt(8)));
        b10.setText(String.valueOf(str.charAt(9)));
        b11.setText(String.valueOf(str.charAt(10)));
        b12.setText(String.valueOf(str.charAt(11)));
        b13.setText(String.valueOf(str.charAt(12)));
        b14.setText(String.valueOf(str.charAt(13)));
        b15.setText(String.valueOf(str.charAt(14)));
        b16.setText(String.valueOf(str.charAt(15)));
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> ch = Arrays.asList(name.split(""));
                Collections.shuffle(ch);
                String Shuffled = "";
                for (String character : ch)
                    Shuffled += character;
                Toast.makeText(MainActivity.this, Shuffled, Toast.LENGTH_SHORT).show();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b1.getText().toString();
                ans.setText(str1);
                b1.setVisibility(View.INVISIBLE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b2.getText().toString();
                ans.setText(str1);
                b2.setVisibility(View.INVISIBLE);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b3.getText().toString();
                ans.setText(str1);
                b3.setVisibility(View.INVISIBLE);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b4.getText().toString();
                ans.setText(str1);
                b4.setVisibility(View.INVISIBLE);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b5.getText().toString();
                ans.setText(str1);
                b5.setVisibility(View.INVISIBLE);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b6.getText().toString();
                ans.setText(str1);
                b6.setVisibility(View.INVISIBLE);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b7.getText().toString();
                ans.setText(str1);
                b7.setVisibility(View.INVISIBLE);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b8.getText().toString();
                ans.setText(str1);
                b8.setVisibility(View.INVISIBLE);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b9.getText().toString();
                ans.setText(str1);
                b9.setVisibility(View.INVISIBLE);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b10.getText().toString();
                ans.setText(str1);
                b10.setVisibility(View.INVISIBLE);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b11.getText().toString();
                ans.setText(str1);
                b11.setVisibility(View.INVISIBLE);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b12.getText().toString();
                ans.setText(str1);
                b12.setVisibility(View.INVISIBLE);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b13.getText().toString();
                ans.setText(str1);
                b13.setVisibility(View.INVISIBLE);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b14.getText().toString();
                ans.setText(str1);
                b14.setVisibility(View.INVISIBLE);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b15.getText().toString();
                b15.setVisibility(View.INVISIBLE);
                ans.setText(str1);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=ans.getText().toString()+b16.getText().toString();
                b16.setVisibility(View.INVISIBLE);
                ans.setText(str1);
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans.getText().toString().equalsIgnoreCase(name))
                {
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    coinsCount+=20;
                    levelCount=coinsCount/100+1;
                    reset();
                    if(count<11)
                    {
                        count++;
                        working();
                    }
                }
                else if(isAnagram(ans.getText().toString(),name))
                {
                    Toast.makeText(MainActivity.this, "Wrong Spelling", Toast.LENGTH_SHORT).show();
                    reset();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    reset();
                }
            }
        });
        coins.setText("Coins="+coinsCount);
        level.setText("Level "+levelCount);
    }

    private static boolean isAnagram(String a, String b)
    {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i),
                        map.get(a.charAt(i)) + 1);
            }
            else {
                map.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i),
                        map.get(b.charAt(i)) - 1);
            }
            else {
                return false;
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }

    private void reset() {
        ans.setText("");
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        b10.setVisibility(View.VISIBLE);
        b11.setVisibility(View.VISIBLE);
        b12.setVisibility(View.VISIBLE);
        b13.setVisibility(View.VISIBLE);
        b14.setVisibility(View.VISIBLE);
        b15.setVisibility(View.VISIBLE);
        b16.setVisibility(View.VISIBLE);
    }


    private static String getAlphaNumericString(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Set<Character> set=new HashSet<>();
        while(set.size()!=n)
        {
            char ch=AlphaNumericString.charAt((int)(Math.random()*(25-0+1)+0));
            set.add(ch);
        }
        String str="";
        for(char x:set)
            str=str+x;
        return str;
    }

    private void initialise() {
        imageView=findViewById(R.id.colour);
        ans=findViewById(R.id.input);
        retry=findViewById(R.id.retryButton);
        hint=findViewById(R.id.hintButton);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);
        b11=findViewById(R.id.button11);
        b12=findViewById(R.id.button12);
        b13=findViewById(R.id.button13);
        b14=findViewById(R.id.button14);
        b15=findViewById(R.id.button15);
        b16=findViewById(R.id.button16);
        check=findViewById(R.id.checkButton);
        level=findViewById(R.id.level);
        coins=findViewById(R.id.coins);
        colours.add(new Pair("BLACK","#000000"));
        colours.add(new Pair("WHITE","#FFFFFF"));
        colours.add(new Pair("RED","#FF0000"));
        colours.add(new Pair("BLUE","#0000FF"));
        colours.add(new Pair("CYAN","#00FFFF"));
        colours.add(new Pair("ORANGE","#FFA500"));
        colours.add(new Pair("PINK","#FF00FF"));
        colours.add(new Pair("GREEN","#008000"));
        colours.add(new Pair("GREY","#808080"));
        colours.add(new Pair("YELLOW","#FFFF00"));
        colours.add(new Pair("BROWN","#A52A2A"));
    }
}