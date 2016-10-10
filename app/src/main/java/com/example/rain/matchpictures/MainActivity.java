package com.example.rain.matchpictures;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView one;
    ImageView two;
    ImageView three;
    ImageView four;
    ImageView five;
    ImageView six;
    ImageView seven;
    ImageView eight;
    ImageView nine;
    ImageView ten;
    ImageView eleven;
    ImageView twelve;
    ImageView thirteen;
    ImageView fourteen;
    ImageView fifteen;
    ImageView sixteen;

    TextView scoreText;
    int score = 0;

    Game game;

    //parameter for the game
    int[] xClicks = new int[2];

    int clickCount = 0;

    int[] images = new int[] {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8
    };

    int imagecard = R.drawable.card;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game16x);

        scoreText = (TextView) findViewById(R.id.playerScore);

        game = new Game();
        game.init();

        xClicks[0] = -1;
        xClicks[1] = -1;
        clickCount = 0;

        one = (ImageView) findViewById(R.id.One);
        two = (ImageView) findViewById(R.id.Two);
        three = (ImageView) findViewById(R.id.Three);
        four = (ImageView) findViewById(R.id.Four);
        five = (ImageView) findViewById(R.id.Five);
        six = (ImageView) findViewById(R.id.Six);
        seven = (ImageView) findViewById(R.id.Seven);
        eight = (ImageView) findViewById(R.id.Eight);
        nine = (ImageView) findViewById(R.id.Nine);
        ten = (ImageView) findViewById(R.id.Ten);
        eleven = (ImageView) findViewById(R.id.Eleven);
        twelve = (ImageView) findViewById(R.id.Twelve);
        thirteen = (ImageView) findViewById(R.id.Thirteen);
        fourteen = (ImageView) findViewById(R.id.Fourteen);
        fifteen = (ImageView) findViewById(R.id.Fifteen);
        sixteen = (ImageView) findViewById(R.id.Sixteen);

        scoreText.setText("");
        for(int i = 0; i < 16; i++) {
            scoreText.append(" " + game.getNumber(i));
        }
        scoreText.append("\n");

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 0;
                clickCount++;
                one.setImageResource(images[game.getNumber(0)]);
                jude();
                //scoreText.append(" " + game.getNumber(0));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 1;
                clickCount++;
                two.setImageResource(images[game.getNumber(1)]);
                //scoreText.append(" " + game.getNumber(1));
                jude();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 2;
                clickCount++;
                three.setImageResource(images[game.getNumber(2)]);
                //scoreText.append(" " + game.getNumber(2));
                jude();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 3;
                clickCount++;
                four.setImageResource(images[game.getNumber(3)]);
                //scoreText.append(" " + game.getNumber(3));
                jude();

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 4;
                clickCount++;
                five.setImageResource(images[game.getNumber(4)]);
                jude();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 5;
                clickCount++;
                six.setImageResource(images[game.getNumber(5)]);
                jude();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 6;
                clickCount++;
                seven.setImageResource(images[game.getNumber(6)]);
                jude();

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 7;
                clickCount++;
                eight.setImageResource(images[game.getNumber(7)]);
                jude();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 8;
                clickCount++;
                nine.setImageResource(images[game.getNumber(8)]);
                jude();

            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 9;
                clickCount++;
                ten.setImageResource(images[game.getNumber(9)]);
                jude();
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 10;
                clickCount++;
                eleven.setImageResource(images[game.getNumber(10)]);
                jude();
            }
        });

        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 11;
                clickCount++;
                twelve.setImageResource(images[game.getNumber(11)]);
                jude();
            }
        });

        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 12;
                clickCount++;
                thirteen.setImageResource(images[game.getNumber(12)]);
                jude();
            }
        });

        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 13;
                clickCount++;
                fourteen.setImageResource(images[game.getNumber(13)]);
                jude();
            }
        });

        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 14;
                clickCount++;
                fifteen.setImageResource(images[game.getNumber(14)]);
                jude();
            }
        });

        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 15;
                clickCount++;
                sixteen.setImageResource(images[game.getNumber(15)]);
                jude();
            }
        });
    }


    void jude() {
        if(clickCount == 1) {

        }else
        if(clickCount == 2) {
            if(xClicks[0] == xClicks[1]){
                clickCount--;
            }
            else {
                if(game.compare(xClicks[0], xClicks[1]) == true) {
                    clickCount = 0;
                }
                else {
                    resetImage(xClicks[0]);
                    xClicks[0] = xClicks[1];
                    clickCount--;
                }
            }

        }

    }

    void resetImage(int imId) {
        switch (imId) {
            case 0:
                one.setImageResource(imagecard);
                break;
            case 1:
                two.setImageResource(imagecard);
                break;
            case 2:
                three.setImageResource(imagecard);
            break;
            case 3:
                four.setImageResource(imagecard);
            break;
            case 4:
                five.setImageResource(imagecard);
            break;
            case 5:
                six.setImageResource(imagecard);
            break;
            case 6:
                seven.setImageResource(imagecard);
            break;
            case 7:
                eight.setImageResource(imagecard);
            break;
            case 8:
                nine.setImageResource(imagecard);
            break;
            case 9:
                ten.setImageResource(imagecard);
            break;
            case 10:
                eleven.setImageResource(imagecard);
            break;
            case 11:
                twelve.setImageResource(imagecard);
            break;
            case 12:
                thirteen.setImageResource(imagecard);
            break;
            case 13:
                fourteen.setImageResource(imagecard);
            break;
            case 14:
                fifteen.setImageResource(imagecard);
            break;
            case 15:
                sixteen.setImageResource(imagecard);
            break;
            default:
                break;
        }
    }


}




