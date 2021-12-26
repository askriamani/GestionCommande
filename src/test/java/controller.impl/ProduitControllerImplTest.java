//package com.mss.controller.impl;
//
//import com.mss.controller.impl.ProduitControllerImpl;
//import com.mss.mapper.ProduitMapper;
//import com.mss.mapper.ReferenceMapper;
//import com.mss.model.Produit;
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
//import com.mss.service.ProduitService;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@RunWith(SpringRunner.class)
//public class ProduitControllerImplTest {
//    //TODO: create the data Test generator class ProduitBuilder
//    private static final String ENDPOINT_URL = "/produits";
//    @MockBean
//    private ReferenceMapper referenceMapper;
//    @InjectMocks
//    private ProduitControllerImpl produitController;
//    @MockBean
//    private ProduitService produitService;
//    @MockBean
//    private ProduitMapper produitMapper;
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup(this.produitController).build();
//    }
//
//    @Test
//    public void getAll() throws Exception {
//        Mockito.when(produitMapper.asDTOList(ArgumentMatchers.any())).thenReturn(ProduitBuilder.getListDTO());
//
//        Mockito.when(produitService.findAll()).thenReturn(ProduitBuilder.getListEntities());
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
//        Mockito.when(produitMapper.asDTO(ArgumentMatchers.any())).thenReturn(ProduitBuilder.getDTO());
//
//        Mockito.when(produitService.findById(ArgumentMatchers.anyString())).thenReturn(java.util.Optional.of(ProduitBuilder.getEntity()));
//
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
//        Mockito.verify(produitService, Mockito.times(1)).findById(1L);
//        Mockito.verifyNoMoreInteractions(produitService);
//    }
//
//    @Test
//    public void save() throws Exception {
//        Mockito.when(produitMapper.asEntity(ArgumentMatchers.any())).thenReturn(ProduitBuilder.getEntity());
//        Mockito.when(produitService.save(ArgumentMatchers.any(Produit.class))).thenReturn(ProduitBuilder.getEntity());
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.post(ENDPOINT_URL)
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .content(CustomUtils.asJsonString(ProduitBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isCreated());
//        Mockito.verify(produitService, Mockito.times(1)).save(ArgumentMatchers.any(Produit.class));
//        Mockito.verifyNoMoreInteractions(produitService);
//    }
//
//    @Test
//    public void update() throws Exception {
//        Mockito.when(produitMapper.asEntity(ArgumentMatchers.any())).thenReturn(ProduitBuilder.getEntity());
//        Mockito.when(produitService.update(ArgumentMatchers.any(), ArgumentMatchers.anyString())).thenReturn(ProduitBuilder.getEntity());
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .content(CustomUtils.asJsonString(ProduitBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(produitService, Mockito.times(1)).update(ArgumentMatchers.any(Produit.class), ArgumentMatchers.anyString());
//        Mockito.verifyNoMoreInteractions(produitService);
//    }
//
//    @Test
//    public void delete() throws Exception {
//        Mockito.doNothing().when(produitService).deleteById(ArgumentMatchers.anyString());
//        mockMvc.perform(
//                MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(produitService, Mockito.times(1)).deleteById(Mockito.anyString());
//        Mockito.verifyNoMoreInteractions(produitService);
//    }
