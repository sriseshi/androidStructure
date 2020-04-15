package com.srise.androidstucture.mvp.presenter;

public interface IPresenter {
    interface ICustomPresenter {
        interface ICustomModel {
            void getTxt();
        }

        interface ICustomView {
            void setTxt(String str);
        }

        void showText();

        void receiveTxt(String str);
    }
}
