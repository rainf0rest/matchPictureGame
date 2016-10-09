package com.example.rain.matchpictures;

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

        xClicks[0] = 0;
        xClicks[1] = 0;

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

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 1;
                clickCount++;
                one.setImageResource(images[game.getNumber(1)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 2;
                clickCount++;
                two.setImageResource(images[game.getNumber(2)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 3;
                clickCount++;
                three.setImageResource(images[game.getNumber(3)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 4;
                clickCount++;
                four.setImageResource(images[game.getNumber(4)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 5;
                clickCount++;
                five.setImageResource(images[game.getNumber(5)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 6;
                clickCount++;
                six.setImageResource(images[game.getNumber(6)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 7;
                clickCount++;
                seven.setImageResource(images[game.getNumber(7)]);
                if (clickCount == 2) {
                    jude();
                }

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 8;
                clickCount++;
                eight.setImageResource(images[game.getNumber(8)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 9;
                clickCount++;
                nine.setImageResource(images[game.getNumber(9)]);
                if (clickCount == 2) {
                    jude();
                }

            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 10;
                clickCount++;
                ten.setImageResource(images[game.getNumber(10)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 11;
                clickCount++;
                eleven.setImageResource(images[game.getNumber(11)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 12;
                clickCount++;
                twelve.setImageResource(images[game.getNumber(12)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 13;
                clickCount++;
                thirteen.setImageResource(images[game.getNumber(13)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 14;
                clickCount++;
                fourteen.setImageResource(images[game.getNumber(14)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 15;
                clickCount++;
                fifteen.setImageResource(images[game.getNumber(15)]);
                if (clickCount == 2) {
                    jude();
                }
            }
        });

        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xClicks[clickCount] = 16;
                clickCount++;
                sixteen.setImageResource(images[game.getNumber(16)]);
                if (clickCount == 2) {
                    jude();
                }

            }
        });
    }


    void jude() {
        if(game.compare(xClicks[0], xClicks[1])) {
            score ++;
            scoreText.setText("" + score);
            game.setNumberToZreo(xClicks[0]);
            game.setNumberToZreo(xClicks[1]);
        }
        else{
            resetImage(xClicks[0]);
            resetImage(xClicks[1]);
        }

        clickCount = 0;
    }

    void resetImage(int imId) {
        switch (imId) {
            case 1:
                one.setImageResource(imagecard);
                break;
            case 2:
                two.setImageResource(imagecard);
                break;
            case 3:
                three.setImageResource(imagecard);
            break;
            case 4:
                four.setImageResource(imagecard);
            break;
            case 5:
                five.setImageResource(imagecard);
            break;
            case 6:
                six.setImageResource(imagecard);
            break;
            case 7:
                seven.setImageResource(imagecard);
            break;
            case 8:
                eight.setImageResource(imagecard);
            break;
            case 9:
                nine.setImageResource(imagecard);
            break;
            case 10:
                ten.setImageResource(imagecard);
            break;
            case 11:
                eleven.setImageResource(imagecard);
            break;
            case 12:
                twelve.setImageResource(imagecard);
            break;
            case 13:
                thirteen.setImageResource(imagecard);
            break;
            case 14:
                fourteen.setImageResource(imagecard);
            break;
            case 15:
                fifteen.setImageResource(imagecard);
            break;
            case 16:
                sixteen.setImageResource(imagecard);
            break;
            default:
                break;
        }
    }


}



