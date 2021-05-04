package com.example.demo;

public class RoundedSizeRectangle {

    int m_width;
    int m_height ;

    public RoundedSizeRectangle(float m_width, float m_height) {
        m_width = Math. round(m_height);
        m_height=Math. round(m_height);
        }

        public int getArea (int m_width,int m_height){
        return m_width*m_height;
        }
}



