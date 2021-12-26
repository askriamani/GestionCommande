//package com.mss.controller.impl;
//
//import com.mss.controller.impl.ClientControllerImpl;
//import com.mss.mapper.ClientMapper;
//import com.mss.mapper.ReferenceMapper;
//import com.mss.model.Client;
//import org.hamcrest.Matchers;
//import org.hamcrest.core.Is;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import com.mss.service.ClientService;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@RunWith(SpringRunner.class)
//public class ClientControllerImplTest {
//    //TODO: create the data Test generator class ClientBuilder
//    private static final String ENDPOINT_URL = "/clients";
//    @MockBean
//    private ReferenceMapper referenceMapper;
//    @InjectMocks
//    private ClientControllerImpl clientController;
//    @MockBean
//    private ClientService clientService;
//    @MockBean
//    private ClientMapper clientMapper;
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup(this.clientController).build();
//    }
//
//    @Test
//    public void getAll() throws Exception {
//        Mockito.when(clientMapper.asDTOList(ArgumentMatchers.any())).thenReturn(ClientBuilder.getListDTO());
//
//        Mockito.when(clientService.findAll()).thenReturn(ClientBuilder.getListEntities());
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
//
//    }
//
//    @Test
//    public void getById() throws Exception {
//        Mockito.when(clientMapper.asDTO(ArgumentMatchers.any())).thenReturn(ClientBuilder.getDTO());
//
//        Mockito.when(clientService.findById(ArgumentMatchers.anyString())).thenReturn(java.util.Optional.of(ClientBuilder.getEntity()));
//
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
//        Mockito.verify(clientService, Mockito.times(1)).findById(1L);
//        Mockito.verifyNoMoreInteractions(clientService);
//    }
//
//    @Test
//    public void save() throws Exception {
//        Mockito.when(clientMapper.asEntity(ArgumentMatchers.any())).thenReturn(ClientBuilder.getEntity());
//        Mockito.when(clientService.save(ArgumentMatchers.any(Client.class))).thenReturn(ClientBuilder.getEntity());
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.post(ENDPOINT_URL)
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .content(CustomUtils.asJsonString(ClientBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isCreated());
//        Mockito.verify(clientService, Mockito.times(1)).save(ArgumentMatchers.any(Client.class));
//        Mockito.verifyNoMoreInteractions(clientService);
//    }
//
//    @Test
//    public void update() throws Exception {
//        Mockito.when(clientMapper.asEntity(ArgumentMatchers.any())).thenReturn(ClientBuilder.getEntity());
//        Mockito.when(clientService.update(ArgumentMatchers.any(), ArgumentMatchers.anyString())).thenReturn(ClientBuilder.getEntity());
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .content(CustomUtils.asJsonString(ClientBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(clientService, Mockito.times(1)).update(ArgumentMatchers.any(Client.class), ArgumentMatchers.anyString());
//        Mockito.verifyNoMoreInteractions(clientService);
//    }
//
//    @Test
//    public void delete() throws Exception {
//        Mockito.doNothing().when(clientService).deleteById(ArgumentMatchers.anyString());
//        mockMvc.perform(
//                MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(clientService, Mockito.times(1)).deleteById(Mockito.anyString());
//        Mockito.verifyNoMoreInteractions(clientService);
//    }
