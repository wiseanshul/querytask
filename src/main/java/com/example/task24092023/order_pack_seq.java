package com.example.task24092023;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class order_pack_seq {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int pack_seq;
    private int shop_details_id;
    private int  agent_id;
    private int order_id;

    public order_pack_seq() {
    }

    public order_pack_seq(int id, int pack_seq, int shop_details_id, int agent_id, int order_id) {
        this.id = id;
        this.pack_seq = pack_seq;
        this.shop_details_id = shop_details_id;
        this.agent_id = agent_id;
        this.order_id = order_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPack_seq() {
        return pack_seq;
    }

    public void setPack_seq(int pack_seq) {
        this.pack_seq = pack_seq;
    }

    public int getShop_details_id() {
        return shop_details_id;
    }

    public void setShop_details_id(int shop_details_id) {
        this.shop_details_id = shop_details_id;
    }

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
}
