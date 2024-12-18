//package com.capstone.bus_service.kafka;
//
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//import com.capstone.bus_service.entity.RealTimeData;
//
//@Service
//public class LocationProducer {
//
//	private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public LocationProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendLocationUpdate(RealTimeData location) {
//        kafkaTemplate.send("bus-location-updates", String.valueOf(location.getBus().getId()));
//    }
//}
