package ir.dorantech.centralportalpublish

import org.slf4j.LoggerFactory

class TestLogger {
    fun setLog(string: String){
        LoggerFactory.getLogger("AliDoran").info(string);
    }

    fun setLog2(string: String){
        LoggerFactory.getLogger("AliDoran").info(string);
    }
}