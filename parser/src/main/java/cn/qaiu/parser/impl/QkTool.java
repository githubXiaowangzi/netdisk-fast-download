package cn.qaiu.parser.impl;

import cn.qaiu.parser.IPanTool;
import cn.qaiu.parser.PanBase;
import io.vertx.core.Future;
import io.vertx.core.Promise;

public class QkTool extends PanBase implements IPanTool {

    public QkTool(String key, String pwd) {
        super(key, pwd);
    }

    public Future<String> parse() {
        Promise<String> promise = Promise.promise();

        promise.complete("https://lz.qaiu.top");
        return promise.future();
    }
}
