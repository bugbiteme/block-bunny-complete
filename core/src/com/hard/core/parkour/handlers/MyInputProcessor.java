package com.hard.core.parkour.handlers;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

/**
 * Created by leonlevy on 11/6/16.
 */
public class MyInputProcessor extends InputAdapter {

    public boolean keyDown(int k) {
        if (k == Input.Keys.Z) {
            MyInput.setKey(MyInput.BUTTON1, true);
        }
        if (k == Input.Keys.X) {
            MyInput.setKey(MyInput.BUTTON2, true);
        }
        return true;
    }

    public boolean keyUp(int k) {
        if (k == Input.Keys.Z) {
            MyInput.setKey(MyInput.BUTTON1, false);
        }
        if (k == Input.Keys.X) {
            MyInput.setKey(MyInput.BUTTON2, false);
        }
        return true;
    }

}
