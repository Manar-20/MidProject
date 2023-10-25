package com.exampleMidPoject.FarasanTrip.Controllar;

import com.exampleMidPoject.FarasanTrip.Entity.Admin;
import com.exampleMidPoject.FarasanTrip.Entity.FarasanTrip;
import com.exampleMidPoject.FarasanTrip.Repository.CustomerRepository;
import com.exampleMidPoject.FarasanTrip.Service.Implementation.CustmoerImplementation;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class FarasanTripControllarTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private CustomerRepository customerRepo;

    @Mock
    private CustmoerImplementation custmoerImplementation;
    private MockMvc mockMvc;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    public void testCreateNewAdmin() throws Exception {
        Admin admin = new Admin(5L,"Lama","lama@gmail.com","Admin");
        FarasanTrip farasanTrip = new FarasanTrip("F101", 12, 120,admin );

        // Convert the FarasanTrip object to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(farasanTrip);
        String requetsBody = objectMapper.writeValueAsString(admin);

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/add-new-Trip")
                        .content(requestBody)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk())
                .andReturn();

        assertTrue(mvcResult.getResponse().getContentAsString().contains("Admin"));
    }
    @Test
    public void testGetAllTrips() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/trips"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("F115"));
    }
    @Test
    public void testUpdateTrip() throws Exception {
        String farryName = "F101";
        Admin admin = new Admin(5L,"Lama","lama@gmail.com","Admin");
        FarasanTrip updatedTrip = new FarasanTrip(farryName, 15, 150,admin );

        // Convert to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(updatedTrip);

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.put("/Update-Trip_Info/{farryName}", farryName)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody)
                )
                .andExpect(status().isOk())
                .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("Trip Information is Updated"));
    }

}