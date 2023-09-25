package com.example.task24092023;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Repository
public interface order_pack_seq_repo extends JpaRepository<order_pack_seq,Integer> {

    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = " delete from order_pack_seq where agent_id= :agent_id ;")
    public int test(@Param("agent_id")int agent_id);

    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "insert into order_pack_seq (pack_seq, shop_details_id, agent_id, order_id) " +
            "select GenerateSequencePackOrder(:agent_id),'111', :agent_id, order_id " +
            "from orders where delivery_date=:delivery_date ;")
    public int test2(@Param("agent_id")int agent_id, @Param("delivery_date")LocalDate delivery_date );



}
