package com.tugas; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HitungLuasSegitigaTest {
    @Test
    void testHitungLuas() {
        
        double hasilDiharapkan = 25.0;
        double hasilAktual = HitungLuasSegitiga.hitung(10, 5);
        
        assertEquals(hasilDiharapkan, hasilAktual);
    }
}