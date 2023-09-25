package com.example.task24092023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class servicesImpl implements services {

    @Autowired
    order_pack_seq_repo orderPackSeqRepo;

    @Override
    public void testrun(int agent_id, LocalDate delivery_date)
    {
        orderPackSeqRepo.test(agent_id);
        orderPackSeqRepo.test2(agent_id,delivery_date);
    }

}
