//package com.mss.controller.impl;
//
//import com.mss.controller.impl.CategorieControllerImpl;
//import com.mss.mapper.CategorieMapper;
//import com.mss.mapper.ReferenceMapper;
//import com.mss.model.Categorie;
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
//import com.mss.service.CategorieService;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@RunWith(SpringRunner.class)
//public class CategorieControllerImplTest {
//    //TODO: create the data Test generator class CategorieBuilder
//    private static final String ENDPOINT_URL = "/categories";
//    @MockBean
//    private ReferenceMapper referenceMapper;
//    @InjectMocks
//    private CategorieControllerImpl categorieController;
//    @MockBean
//    private CategorieService categorieService;
//    @MockBean
//    private CategorieMapper categorieMapper;
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup(this.categorieController).build();
//    }
//
//    @Test
//    public void getAll() throws Exception {
//        Mockito.when(categorieMapper.asDTOList(ArgumentMatchers.any())).thenReturn(CategorieBuilder.getListDTO());
//
//        Mockito.when(categorieService.findAll()).thenReturn(CategorieBuilder.getListEntities());
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
//        Mockito.when(categorieMapper.asDTO(ArgumentMatchers.any())).thenReturn(CategorieBuilder.getDTO());
//
//        Mockito.when(categorieService.findById(ArgumentMatchers.anyString())).thenReturn(java.util.Optional.of(CategorieBuilder.getEntity()));
//
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
//        Mockito.verify(categorieService, Mockito.times(1)).findById(1L);
//        Mockito.verifyNoMoreInteractions(categorieService);
//    }
//
//    @Test
//    public void save() throws Exception {
//        Mockito.when(categorieMapper.asEntity(ArgumentMatchers.any())).thenReturn(CategorieBuilder.getEntity());
//        Mockito.when(categorieService.save(ArgumentMatchers.any(Categorie.class))).thenReturn(CategorieBuilder.getEntity());
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.post(ENDPOINT_URL)
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .content(CustomUtils.asJsonString(CategorieBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isCreated());
//        Mockito.verify(categorieService, Mockito.times(1)).save(ArgumentMatchers.any(Categorie.class));
//        Mockito.verifyNoMoreInteractions(categorieService);
//    }
//
//    @Test
//    public void update() throws Exception {
//        Mockito.when(categorieMapper.asEntity(ArgumentMatchers.any())).thenReturn(CategorieBuilder.getEntity());
//        Mockito.when(categorieService.update(ArgumentMatchers.any(), ArgumentMatchers.anyString())).thenReturn(CategorieBuilder.getEntity());
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .content(CustomUtils.asJsonString(CategorieBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(categorieService, Mockito.times(1)).update(ArgumentMatchers.any(Categorie.class), ArgumentMatchers.anyString());
//        Mockito.verifyNoMoreInteractions(categorieService);
//    }
//
//    @Test
//    public void delete() throws Exception {
//        Mockito.doNothing().when(categorieService).deleteById(ArgumentMatchers.anyString());
//        mockMvc.perform(
//                MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(categorieService, Mockito.times(1)).deleteById(Mockito.anyString());
//        Mockito.verifyNoMoreInteractions(categorieService);
//    }
