package com.gmail.chickenpowerrr.ranksync.manager;

import com.gmail.chickenpowerrr.ranksync.api.RankSyncApi;
import com.gmail.chickenpowerrr.ranksync.discord.BotFactory;
import lombok.Getter;

public class RankSyncManager {

    @Getter public static final RankSyncManager instance = new RankSyncManager();

    private boolean started = false;

    private RankSyncManager(){}

    public void setup() {
        if(!started) {
            RankSyncApi.getApi().addBotFactory("Discord", BotFactory.getInstance());
            started = true;
        }
    }
}