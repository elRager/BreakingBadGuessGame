
import java.awt.Dialog.ModalityType;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PantallaJuego extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
   
    ArrayList<Persona> personas;
    private int aleatorio;
    
    // CON ARCHIVO
    public static ArrayList<Persona> obtener() {
        
        final String NOMBRE_ARCHIVO = "src/data.txt";
        final String SEPARADOR_CAMPO = ";";
        
        ArrayList<Persona> personas = new ArrayList<Persona>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        
        try {
            fileReader = new FileReader(NOMBRE_ARCHIVO);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            
            while((linea = bufferedReader.readLine()) != null) {
                String[] personaComoArreglo = linea.split(SEPARADOR_CAMPO);
                personas.add(new Persona(personaComoArreglo[0], Boolean.parseBoolean(personaComoArreglo[1]), Boolean.parseBoolean(personaComoArreglo[2]), Boolean.parseBoolean(personaComoArreglo[3]), Boolean.parseBoolean(personaComoArreglo[4]), Boolean.parseBoolean(personaComoArreglo[5]), Boolean.parseBoolean(personaComoArreglo[6]), Boolean.parseBoolean(personaComoArreglo[7]), Boolean.parseBoolean(personaComoArreglo[8]), Boolean.parseBoolean(personaComoArreglo[9]), Boolean.parseBoolean(personaComoArreglo[10])));
            }
        } catch (IOException e) {
            System.out.println("No es posible leer el archivo: " + e.getMessage());
        } finally {
            try {
                if(fileReader != null) {
                    fileReader.close();
                } if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Excepción al cerrar el archivo: " + e.getMessage());
            }
            return personas;
        }
    }
    
    public PantallaJuego() {
        
        this.setContentPane(fondo);
        
        Random r = new Random();
        aleatorio = r.nextInt(11); 
        
        // CON ARCHIVO
        personas = obtener();
       
        // INSERTANDO MANUALMENTE
        /*personas = new ArrayList<Persona>();
                
        Persona Walter = new Persona("Walter", true, false, false, false, true, true, false, true, false, false);
        Persona WalterJr = new Persona("Walter Jr", true, false, true, false, false, false, false, false, false, false);
        Persona Jesse = new Persona("Jesse", true, false, true, false, false, false, false, true, false, false);
        Persona Saul = new Persona("Saul", true, false, true, false, false, false, true, false, false, false);
        Persona Gus = new Persona("Gus", true, false, true, false, false, true, true, false, false, false);
        Persona Skyler = new Persona("Skyler", false, true, false, true, false, false, false, false, false, true);
        Persona Marie = new Persona("Marie", false, true, true, false, false, false, false, false, false, true);
        Persona Hank = new Persona("Hank", true, false, false, false, true, false, false, false, false, true);
        Persona Mike = new Persona("Mike", true, false, false, false, true, false, false, true, false, false);
        Persona Jane = new Persona("Jane", false, true, true, false, false, false, false, false, false, false);
        Persona Tuco = new Persona("Tuco", true, false, true, false, false, false, false, false, false, true);
        Persona Hector = new Persona("Hector", true, false, false, false, true, false, false, true, true, false);
        
        personas.add(Walter);
        personas.add(WalterJr);
        personas.add(Jesse);
        personas.add(Saul);
        personas.add(Gus);
        personas.add(Skyler);
        personas.add(Marie);
        personas.add(Hank);
        personas.add(Mike);
        personas.add(Jane);
        personas.add(Tuco);
        personas.add(Hector);*/
        
        for(int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            System.out.println(persona.getNombre() + "[Hombre: " + persona.isHombre() + ", Mujer: " + persona.isMujer() + ", Moreno: " + persona.isMoreno() + ", Rubio: " + persona.isRubio() + ", Calvo: " + persona.isCalvo() + ", Gafas: " + persona.isGafas() + ", Corbata: " + persona.isCorbata() + ", Barba: " + persona.isBarba() + ", Sombrero: " + persona.isSombrero() + ", Cuello: " + persona.isCuello() + "]");
        }
        
        System.out.println("Personaje elegido: " + aleatorio);
        System.out.println("Nombre: " + personas.get(aleatorio).getNombre());
        System.out.println("Hombre: " + personas.get(aleatorio).isHombre());
        System.out.println("Mujer: " + personas.get(aleatorio).isMujer());
        System.out.println("Moreno: " + personas.get(aleatorio).isMoreno());
        System.out.println("Rubio: " + personas.get(aleatorio).isRubio());
        System.out.println("Calvo: " + personas.get(aleatorio).isCalvo());
        System.out.println("Gafas: " + personas.get(aleatorio).isGafas());
        System.out.println("Corbata: " + personas.get(aleatorio).isCorbata());
        System.out.println("Barba: " + personas.get(aleatorio).isBarba());
        System.out.println("Sombrero: " + personas.get(aleatorio).isSombrero());
        System.out.println("Cuello: " + personas.get(aleatorio).isCuello());
   
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMain = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        pInferior = new javax.swing.JPanel();
        pImagenes = new javax.swing.JPanel();
        pGus = new javax.swing.JPanel();
        imgGus = new javax.swing.JLabel();
        lGus = new javax.swing.JLabel();
        pJane = new javax.swing.JPanel();
        imgJane = new javax.swing.JLabel();
        lJane = new javax.swing.JLabel();
        pHank = new javax.swing.JPanel();
        imgHank = new javax.swing.JLabel();
        lHank = new javax.swing.JLabel();
        pJesse = new javax.swing.JPanel();
        imgJesse = new javax.swing.JLabel();
        lJesse = new javax.swing.JLabel();
        pTuco = new javax.swing.JPanel();
        imgTuco = new javax.swing.JLabel();
        lTuco = new javax.swing.JLabel();
        pMike = new javax.swing.JPanel();
        imgMike = new javax.swing.JLabel();
        lMike = new javax.swing.JLabel();
        pSkyler = new javax.swing.JPanel();
        imgSkyler = new javax.swing.JLabel();
        lSkyler = new javax.swing.JLabel();
        pSaul = new javax.swing.JPanel();
        imgSaul = new javax.swing.JLabel();
        lSaul = new javax.swing.JLabel();
        pWalter = new javax.swing.JPanel();
        imgWalter = new javax.swing.JLabel();
        lWalter = new javax.swing.JLabel();
        pWalterJr = new javax.swing.JPanel();
        imgWalterJr = new javax.swing.JLabel();
        lWalterJr = new javax.swing.JLabel();
        pMarie = new javax.swing.JPanel();
        imgMarie = new javax.swing.JLabel();
        lMarie = new javax.swing.JLabel();
        pHector = new javax.swing.JPanel();
        imgHector = new javax.swing.JLabel();
        lHector = new javax.swing.JLabel();
        pPreguntas = new javax.swing.JPanel();
        cPreguntas = new javax.swing.JComboBox<>();
        bPreguntar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tRespuestas = new javax.swing.JTextArea();
        pOpciones = new javax.swing.JPanel();
        fRespuesta = new javax.swing.JTextField();
        bAdivinar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        mMenu = new javax.swing.JMenuBar();
        mOpciones = new javax.swing.JMenu();
        mReestablecer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pMain.setMaximumSize(new java.awt.Dimension(1280, 720));
        pMain.setMinimumSize(new java.awt.Dimension(1280, 720));
        pMain.setName(""); // NOI18N
        pMain.setOpaque(false);
        pMain.setPreferredSize(new java.awt.Dimension(1280, 720));
        pMain.setLayout(new java.awt.BorderLayout());

        pTitulo.setOpaque(false);
        pTitulo.setLayout(new java.awt.BorderLayout());
        pMain.add(pTitulo, java.awt.BorderLayout.NORTH);

        pInferior.setOpaque(false);
        pInferior.setLayout(new java.awt.BorderLayout());

        pImagenes.setMaximumSize(new java.awt.Dimension(450, 600));
        pImagenes.setOpaque(false);
        pImagenes.setRequestFocusEnabled(false);
        pImagenes.setLayout(new java.awt.GridLayout(3, 4, 0, 20));

        pGus.setOpaque(false);
        pGus.setLayout(new java.awt.BorderLayout());

        imgGus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gus.jpg"))); // NOI18N
        imgGus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGusMouseClicked(evt);
            }
        });
        pGus.add(imgGus, java.awt.BorderLayout.CENTER);

        lGus.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lGus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lGus.setText("Gus");
        lGus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lGus.setMaximumSize(new java.awt.Dimension(20, 20));
        lGus.setMinimumSize(new java.awt.Dimension(20, 20));
        lGus.setPreferredSize(new java.awt.Dimension(20, 20));
        pGus.add(lGus, java.awt.BorderLayout.NORTH);

        pImagenes.add(pGus);

        pJane.setOpaque(false);
        pJane.setLayout(new java.awt.BorderLayout());

        imgJane.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgJane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jane.jpg"))); // NOI18N
        imgJane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgJaneMouseClicked(evt);
            }
        });
        pJane.add(imgJane, java.awt.BorderLayout.CENTER);

        lJane.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lJane.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lJane.setText("Jane");
        pJane.add(lJane, java.awt.BorderLayout.NORTH);

        pImagenes.add(pJane);

        pHank.setOpaque(false);
        pHank.setLayout(new java.awt.BorderLayout());

        imgHank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hank.jpg"))); // NOI18N
        imgHank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHankMouseClicked(evt);
            }
        });
        pHank.add(imgHank, java.awt.BorderLayout.CENTER);

        lHank.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lHank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lHank.setText("Hank");
        pHank.add(lHank, java.awt.BorderLayout.NORTH);

        pImagenes.add(pHank);

        pJesse.setOpaque(false);
        pJesse.setLayout(new java.awt.BorderLayout());

        imgJesse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgJesse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jesse.jpg"))); // NOI18N
        imgJesse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgJesseMouseClicked(evt);
            }
        });
        pJesse.add(imgJesse, java.awt.BorderLayout.CENTER);

        lJesse.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        lJesse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lJesse.setText("Jesse");
        pJesse.add(lJesse, java.awt.BorderLayout.NORTH);

        pImagenes.add(pJesse);

        pTuco.setOpaque(false);
        pTuco.setLayout(new java.awt.BorderLayout());

        imgTuco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTuco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tuco.jpg"))); // NOI18N
        imgTuco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgTucoMouseClicked(evt);
            }
        });
        pTuco.add(imgTuco, java.awt.BorderLayout.CENTER);

        lTuco.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lTuco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTuco.setText("Tuco");
        pTuco.add(lTuco, java.awt.BorderLayout.NORTH);

        pImagenes.add(pTuco);

        pMike.setOpaque(false);
        pMike.setLayout(new java.awt.BorderLayout());

        imgMike.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mike.jpg"))); // NOI18N
        imgMike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMikeMouseClicked(evt);
            }
        });
        pMike.add(imgMike, java.awt.BorderLayout.CENTER);

        lMike.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lMike.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMike.setText("Mike");
        pMike.add(lMike, java.awt.BorderLayout.NORTH);

        pImagenes.add(pMike);

        pSkyler.setOpaque(false);
        pSkyler.setLayout(new java.awt.BorderLayout());

        imgSkyler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSkyler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/skyler.jpg"))); // NOI18N
        imgSkyler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSkylerMouseClicked(evt);
            }
        });
        pSkyler.add(imgSkyler, java.awt.BorderLayout.CENTER);

        lSkyler.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lSkyler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSkyler.setText("Skyler");
        pSkyler.add(lSkyler, java.awt.BorderLayout.NORTH);

        pImagenes.add(pSkyler);

        pSaul.setOpaque(false);
        pSaul.setLayout(new java.awt.BorderLayout());

        imgSaul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSaul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/saul.jpg"))); // NOI18N
        imgSaul.setMaximumSize(new java.awt.Dimension(150, 200));
        imgSaul.setMinimumSize(new java.awt.Dimension(150, 200));
        imgSaul.setPreferredSize(new java.awt.Dimension(150, 200));
        imgSaul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSaulMouseClicked(evt);
            }
        });
        pSaul.add(imgSaul, java.awt.BorderLayout.CENTER);

        lSaul.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lSaul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSaul.setText("Saul");
        pSaul.add(lSaul, java.awt.BorderLayout.NORTH);

        pImagenes.add(pSaul);

        pWalter.setOpaque(false);
        pWalter.setLayout(new java.awt.BorderLayout());

        imgWalter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgWalter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/walter.jpg"))); // NOI18N
        imgWalter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgWalterMouseClicked(evt);
            }
        });
        pWalter.add(imgWalter, java.awt.BorderLayout.CENTER);

        lWalter.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lWalter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lWalter.setText("Walter");
        pWalter.add(lWalter, java.awt.BorderLayout.NORTH);

        pImagenes.add(pWalter);

        pWalterJr.setOpaque(false);
        pWalterJr.setLayout(new java.awt.BorderLayout());

        imgWalterJr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgWalterJr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/walterjr.jpg"))); // NOI18N
        imgWalterJr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgWalterJrMouseClicked(evt);
            }
        });
        pWalterJr.add(imgWalterJr, java.awt.BorderLayout.CENTER);

        lWalterJr.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lWalterJr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lWalterJr.setText("Walter Jr");
        pWalterJr.add(lWalterJr, java.awt.BorderLayout.NORTH);

        pImagenes.add(pWalterJr);

        pMarie.setOpaque(false);
        pMarie.setLayout(new java.awt.BorderLayout());

        imgMarie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMarie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marie.jpg"))); // NOI18N
        imgMarie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMarieMouseClicked(evt);
            }
        });
        pMarie.add(imgMarie, java.awt.BorderLayout.CENTER);

        lMarie.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lMarie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMarie.setText("Marie");
        pMarie.add(lMarie, java.awt.BorderLayout.NORTH);

        pImagenes.add(pMarie);

        pHector.setOpaque(false);
        pHector.setLayout(new java.awt.BorderLayout());

        imgHector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hector.jpg"))); // NOI18N
        imgHector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHectorMouseClicked(evt);
            }
        });
        pHector.add(imgHector, java.awt.BorderLayout.CENTER);

        lHector.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lHector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lHector.setText("Hector");
        pHector.add(lHector, java.awt.BorderLayout.NORTH);

        pImagenes.add(pHector);

        pInferior.add(pImagenes, java.awt.BorderLayout.CENTER);

        pPreguntas.setOpaque(false);
        pPreguntas.setLayout(new java.awt.BorderLayout());

        cPreguntas.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cPreguntas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Es hombre?", "¿Es mujer?", "¿Tiene el pelo moreno?", "¿Tiene el pelo rubio?", "¿Es calvo?", "¿Tiene gafas?", "¿Lleva corbata?", "¿Tiene barba?", "¿Lleva sombrero?", "¿Lleva accesorios en el cuello?" }));
        cPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPreguntasActionPerformed(evt);
            }
        });
        pPreguntas.add(cPreguntas, java.awt.BorderLayout.NORTH);

        bPreguntar.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bPreguntar.setText("Preguntar");
        bPreguntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPreguntarActionPerformed(evt);
            }
        });
        pPreguntas.add(bPreguntar, java.awt.BorderLayout.SOUTH);

        jScrollPane1.setOpaque(false);

        tRespuestas.setBackground(new java.awt.Color(0, 102, 0));
        tRespuestas.setColumns(20);
        tRespuestas.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        tRespuestas.setForeground(new java.awt.Color(255, 255, 255));
        tRespuestas.setRows(5);
        tRespuestas.setOpaque(false);
        jScrollPane1.setViewportView(tRespuestas);

        pPreguntas.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pInferior.add(pPreguntas, java.awt.BorderLayout.EAST);

        pOpciones.setOpaque(false);

        fRespuesta.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        fRespuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fRespuesta.setMinimumSize(new java.awt.Dimension(200, 200));
        fRespuesta.setPreferredSize(new java.awt.Dimension(82, 30));
        fRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRespuestaActionPerformed(evt);
            }
        });
        pOpciones.add(fRespuesta);

        bAdivinar.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bAdivinar.setText("Adivinar");
        bAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdivinarActionPerformed(evt);
            }
        });
        pOpciones.add(bAdivinar);

        bSalir.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        pOpciones.add(bSalir);

        pInferior.add(pOpciones, java.awt.BorderLayout.SOUTH);

        pMain.add(pInferior, java.awt.BorderLayout.CENTER);

        mOpciones.setText("Opciones");
        mOpciones.setToolTipText("");

        mReestablecer.setText("Reestablecer partida");
        mReestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mReestablecerActionPerformed(evt);
            }
        });
        mOpciones.add(mReestablecer);

        mMenu.add(mOpciones);

        setJMenuBar(mMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRespuestaActionPerformed
        
    }//GEN-LAST:event_fRespuestaActionPerformed

    private void cPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPreguntasActionPerformed
        
    }//GEN-LAST:event_cPreguntasActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bPreguntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPreguntarActionPerformed
        // Hombre
        if((cPreguntas.getSelectedItem()) == "¿Es hombre?") {
            if(personas.get(aleatorio).isHombre() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Es hombre? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Es hombre? FALSO\n");
            }
        }
        
        // Mujer
        if((cPreguntas.getSelectedItem()) == "¿Es mujer?") {
            if(personas.get(aleatorio).isMujer() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Es mujer? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Es mujer? FALSO\n");
            }
        }
        
        // Moreno
        if((cPreguntas.getSelectedItem()) == "¿Tiene el pelo moreno?") {
            if(personas.get(aleatorio).isMoreno() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Tiene el pelo moreno? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Tiene el pelo moreno? FALSO\n");
            }
        }
        
        // Rubio
        if((cPreguntas.getSelectedItem()) == "¿Tiene el pelo rubio?") {
            if(personas.get(aleatorio).isRubio() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Tiene el pelo rubio? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Tiene el pelo rubio? FALSO\n");
            }
        }
        
        // Calvo
        if((cPreguntas.getSelectedItem()) == "¿Es calvo?") {
            if(personas.get(aleatorio).isCalvo() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Es calvo? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Es calvo? FALSO\n");
            }
        }
        
        // Gafas
        if((cPreguntas.getSelectedItem()) == "¿Tiene gafas?") {
            if(personas.get(aleatorio).isGafas() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Tiene gafas? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Tiene gafas? FALSO\n");
            }
        }
        
        // Corbata
        if((cPreguntas.getSelectedItem()) == "¿Lleva corbata?") {
            if(personas.get(aleatorio).isCorbata() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Lleva corbata? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Lleva corbata? FALSO\n");
            }
        }
        
        // Barba
        if((cPreguntas.getSelectedItem()) == "¿Tiene barba?") {
            if(personas.get(aleatorio).isBarba() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Tiene barba? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Tiene barba? FALSO\n");
            }
        }
        
        // Sombrero
        if((cPreguntas.getSelectedItem()) == "¿Lleva sombrero?") {
            if(personas.get(aleatorio).isSombrero() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Lleva sombrero? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Lleva sombrero? FALSO\n");
            }
        }
        
        // Cuello
        if((cPreguntas.getSelectedItem()) == "¿Lleva accesorios en el cuello?") {
            if(personas.get(aleatorio).isCuello() == true) {
                tRespuestas.setText(tRespuestas.getText() + "¿Lleva accesorios en el cuello? VERDADERO\n");
            } else {
                tRespuestas.setText(tRespuestas.getText() + "¿Lleva accesorios en el cuello? FALSO\n");
            }
        }
    }//GEN-LAST:event_bPreguntarActionPerformed

    private void bAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdivinarActionPerformed
        if(fRespuesta.getText().equals(personas.get(aleatorio).getNombre())) {
            
            System.out.println("EL JUGADOR HA ACERTADO");
            
            int result = JOptionPane.showConfirmDialog(null, "¡HAS GANADO!", "",JOptionPane.DEFAULT_OPTION);
            
            if (result == JOptionPane.OK_OPTION) {
                System.exit(0);                
            }
        } else {
            
            System.out.println("EL JUGADOR HA FALLADO");
            
            int result = JOptionPane.showConfirmDialog(null, "¡HAS PERDIDO!", "",JOptionPane.DEFAULT_OPTION);
            
            if (result == JOptionPane.OK_OPTION) {
                System.exit(0);                
            }
        }
    }//GEN-LAST:event_bAdivinarActionPerformed

    private void imgGusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGusMouseClicked
        pGus.setVisible(false);
    }//GEN-LAST:event_imgGusMouseClicked

    private void imgHankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHankMouseClicked
        pHank.setVisible(false);
    }//GEN-LAST:event_imgHankMouseClicked

    private void imgJesseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgJesseMouseClicked
        pJesse.setVisible(false);
    }//GEN-LAST:event_imgJesseMouseClicked

    private void imgMikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMikeMouseClicked
        pMike.setVisible(false);
    }//GEN-LAST:event_imgMikeMouseClicked

    private void imgSaulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSaulMouseClicked
        pSaul.setVisible(false);
    }//GEN-LAST:event_imgSaulMouseClicked

    private void imgSkylerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSkylerMouseClicked
        pSkyler.setVisible(false);
    }//GEN-LAST:event_imgSkylerMouseClicked

    private void imgWalterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgWalterMouseClicked
        pWalter.setVisible(false);
    }//GEN-LAST:event_imgWalterMouseClicked

    private void imgWalterJrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgWalterJrMouseClicked
        pWalterJr.setVisible(false);
    }//GEN-LAST:event_imgWalterJrMouseClicked

    private void imgMarieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMarieMouseClicked
        pMarie.setVisible(false);
    }//GEN-LAST:event_imgMarieMouseClicked

    private void imgJaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgJaneMouseClicked
        pJane.setVisible(false);
    }//GEN-LAST:event_imgJaneMouseClicked

    private void imgTucoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTucoMouseClicked
        pTuco.setVisible(false);
    }//GEN-LAST:event_imgTucoMouseClicked

    private void imgHectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHectorMouseClicked
        pHector.setVisible(false);
    }//GEN-LAST:event_imgHectorMouseClicked

    private void mReestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mReestablecerActionPerformed
        this.setVisible(false);
        PantallaJuego juego = new PantallaJuego();
        juego.setVisible(true);
    }//GEN-LAST:event_mReestablecerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdivinar;
    private javax.swing.JButton bPreguntar;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cPreguntas;
    private javax.swing.JTextField fRespuesta;
    private javax.swing.JLabel imgGus;
    private javax.swing.JLabel imgHank;
    private javax.swing.JLabel imgHector;
    private javax.swing.JLabel imgJane;
    private javax.swing.JLabel imgJesse;
    private javax.swing.JLabel imgMarie;
    private javax.swing.JLabel imgMike;
    private javax.swing.JLabel imgSaul;
    private javax.swing.JLabel imgSkyler;
    private javax.swing.JLabel imgTuco;
    private javax.swing.JLabel imgWalter;
    private javax.swing.JLabel imgWalterJr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lGus;
    private javax.swing.JLabel lHank;
    private javax.swing.JLabel lHector;
    private javax.swing.JLabel lJane;
    private javax.swing.JLabel lJesse;
    private javax.swing.JLabel lMarie;
    private javax.swing.JLabel lMike;
    private javax.swing.JLabel lSaul;
    private javax.swing.JLabel lSkyler;
    private javax.swing.JLabel lTuco;
    private javax.swing.JLabel lWalter;
    private javax.swing.JLabel lWalterJr;
    private javax.swing.JMenuBar mMenu;
    private javax.swing.JMenu mOpciones;
    private javax.swing.JMenuItem mReestablecer;
    private javax.swing.JPanel pGus;
    private javax.swing.JPanel pHank;
    private javax.swing.JPanel pHector;
    private javax.swing.JPanel pImagenes;
    private javax.swing.JPanel pInferior;
    private javax.swing.JPanel pJane;
    private javax.swing.JPanel pJesse;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pMarie;
    private javax.swing.JPanel pMike;
    private javax.swing.JPanel pOpciones;
    private javax.swing.JPanel pPreguntas;
    private javax.swing.JPanel pSaul;
    private javax.swing.JPanel pSkyler;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPanel pTuco;
    private javax.swing.JPanel pWalter;
    private javax.swing.JPanel pWalterJr;
    private javax.swing.JTextArea tRespuestas;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondojuego.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
}
