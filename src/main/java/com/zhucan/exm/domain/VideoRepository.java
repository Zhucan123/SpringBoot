package com.zhucan.exm.domain;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends BaseRepository<V_Video,Integer> {

    @Query("from V_Video ")
     List<Object> findAllByVideoSNNotNull();
}
