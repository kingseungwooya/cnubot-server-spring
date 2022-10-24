package com.cnubot.cnubotserver.domain.Component;

import com.cnubot.cnubotserver.domain.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BoardScheduler {
    @Autowired
    BoardService boardService;

    //cron 방식으로 스케쥴링 1시간 간격으로 refresh
    @Scheduled(cron = "0 0/30 * 1/1 * ? ")
    public void refresh(){
        boardService.refreshBoards();
    }
}
