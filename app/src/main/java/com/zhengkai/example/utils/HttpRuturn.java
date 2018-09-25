package com.zhengkai.example.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.zhengkai.Bean.ChatMessage;
import com.zhengkai.Bean.JSONBean;
import com.zhengkai.example.widget.Config;
import com.zhengkai.example.widget.Result;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Alienware on 2018-05-31.
 */

public class HttpRuturn {

    /**
     *
     *
     * @param message ：发送的消息
     * @return：消息对象
     */
    public static ChatMessage sendMessage(String message) {

        ChatMessage chatMessage = new ChatMessage();

                    chatMessage.setMessage(message);

        chatMessage.setData(new Date());
        chatMessage.setType(ChatMessage.Type.INCOUNT);
        return chatMessage;
    }

}
