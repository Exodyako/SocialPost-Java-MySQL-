
package Plegables;

import Clases.AAFunciones;
import Clases.CargarArchivos;
import Clases.RegistrarseFunciones;
import UsuariosSocialPOST.Administrador;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;


public class AñadirAdministrador extends javax.swing.JDialog {

    Administrador Adm;
    CargarArchivos cargar = new CargarArchivos(null);
    AAFunciones AAF = new AAFunciones(this);
    
    public AñadirAdministrador(java.awt.Frame parent, boolean modal, Administrador Adm) {
        super(parent, modal);
        initComponents();
        setLocation(770, 72);
        this.Adm = Adm;
        
        AñoSpinner.setVisible(false);
        IngresarAño.setVisible(false);
        SeleccionarAño.setVisible(false);
        
        SpinnerNumberModel AS = new SpinnerNumberModel();
        AS.setMaximum(2018);
        AS.setMinimum(1000);
        AS.setValue(1000);
        AñoSpinner.setModel(AS);
        
    }

    public AñadirAdministrador(Administrador Adm, JTextField Apdo, JLabel ApellidoUE, JButton Añadir, JComboBox<String> Año, JSpinner AñoSpinner, JPasswordField ContraseñaOculta, JTextField ContraseñaVisible, JTextField Correo, JLabel CorreoUE, JComboBox<String> Dia, JComboBox<String> Extencion, JLabel FAñoUE, JLabel FDiaUE, JLabel FMesUE, JRadioButton Hombre, JButton IngresarAño, JTextField IngresarSlogan, JComboBox<String> Mes, JRadioButton Mujer, JTextField Nom, JLabel NomUE, JPanel PanelPlegableAñadir, JLabel SeguridadUE1, JButton SeleccionarAño, JLabel SloganUE, JComboBox<String> TipoCorreo, JLabel ValidarCantidadDeContraseña, JLabel jLabel1) {
        this.Adm = Adm;
        this.Apdo = Apdo;
        this.ApellidoUE = ApellidoUE;
        this.Añadir = Añadir;
        this.Año = Año;
        this.AñoSpinner = AñoSpinner;
        this.ContraseñaOculta = ContraseñaOculta;
        this.ContraseñaVisible = ContraseñaVisible;
        this.Correo = Correo;
        this.CorreoUE = CorreoUE;
        this.Dia = Dia;
        this.Extencion = Extencion;
        this.FAñoUE = FAñoUE;
        this.FDiaUE = FDiaUE;
        this.FMesUE = FMesUE;
        this.Hombre = Hombre;
        this.IngresarAño = IngresarAño;
        this.IngresarSlogan = IngresarSlogan;
        this.Mes = Mes;
        this.Mujer = Mujer;
        this.Nom = Nom;
        this.NomUE = NomUE;
        this.PanelPlegableAñadir = PanelPlegableAñadir;
        this.SeguridadUE1 = SeguridadUE1;
        this.SeleccionarAño = SeleccionarAño;
        this.SloganUE = SloganUE;
        this.TipoCorreo = TipoCorreo;
        this.ValidarCantidadDeContraseña = ValidarCantidadDeContraseña;
        this.jLabel1 = jLabel1;
    }

    public Administrador getAdm() {
        return Adm;
    }

    public void setAdm(Administrador Adm) {
        this.Adm = Adm;
    }

    public AAFunciones getAAF() {
        return AAF;
    }

    public void setAAF(AAFunciones AAF) {
        this.AAF = AAF;
    }

    public JTextField getApdo() {
        return Apdo;
    }

    public void setApdo(JTextField Apdo) {
        this.Apdo = Apdo;
    }

    public JLabel getApellidoUE() {
        return ApellidoUE;
    }

    public void setApellidoUE(JLabel ApellidoUE) {
        this.ApellidoUE = ApellidoUE;
    }

    public static JTextField getArrobaUE() {
        return ArrobaUE;
    }

    public static void setArrobaUE(JTextField ArrobaUE) {
        AñadirAdministrador.ArrobaUE = ArrobaUE;
    }

    public JButton getAñadir() {
        return Añadir;
    }

    public void setAñadir(JButton Añadir) {
        this.Añadir = Añadir;
    }

    public JComboBox<String> getAño() {
        return Año;
    }

    public void setAño(JComboBox<String> Año) {
        this.Año = Año;
    }

    public JSpinner getAñoSpinner() {
        return AñoSpinner;
    }

    public void setAñoSpinner(JSpinner AñoSpinner) {
        this.AñoSpinner = AñoSpinner;
    }

    public JPasswordField getContraseñaOculta() {
        return ContraseñaOculta;
    }

    public void setContraseñaOculta(JPasswordField ContraseñaOculta) {
        this.ContraseñaOculta = ContraseñaOculta;
    }

    public JTextField getContraseñaVisible() {
        return ContraseñaVisible;
    }

    public void setContraseñaVisible(JTextField ContraseñaVisible) {
        this.ContraseñaVisible = ContraseñaVisible;
    }

    public JTextField getCorreo() {
        return Correo;
    }

    public void setCorreo(JTextField Correo) {
        this.Correo = Correo;
    }

    public JLabel getCorreoUE() {
        return CorreoUE;
    }

    public void setCorreoUE(JLabel CorreoUE) {
        this.CorreoUE = CorreoUE;
    }

    public JComboBox<String> getDia() {
        return Dia;
    }

    public void setDia(JComboBox<String> Dia) {
        this.Dia = Dia;
    }

    public static JLabel getEdadUE() {
        return EdadUE;
    }

    public static void setEdadUE(JLabel EdadUE) {
        AñadirAdministrador.EdadUE = EdadUE;
    }

    public JComboBox<String> getExtencion() {
        return Extencion;
    }

    public void setExtencion(JComboBox<String> Extencion) {
        this.Extencion = Extencion;
    }

    public JLabel getFAñoUE() {
        return FAñoUE;
    }

    public void setFAñoUE(JLabel FAñoUE) {
        this.FAñoUE = FAñoUE;
    }

    public JLabel getFDiaUE() {
        return FDiaUE;
    }

    public void setFDiaUE(JLabel FDiaUE) {
        this.FDiaUE = FDiaUE;
    }

    public JLabel getFMesUE() {
        return FMesUE;
    }

    public void setFMesUE(JLabel FMesUE) {
        this.FMesUE = FMesUE;
    }

    public static JLabel getGeneroUE() {
        return GeneroUE;
    }

    public static void setGeneroUE(JLabel GeneroUE) {
        AñadirAdministrador.GeneroUE = GeneroUE;
    }

    public JRadioButton getHombre() {
        return Hombre;
    }

    public void setHombre(JRadioButton Hombre) {
        this.Hombre = Hombre;
    }

    public JButton getIngresarAño() {
        return IngresarAño;
    }

    public void setIngresarAño(JButton IngresarAño) {
        this.IngresarAño = IngresarAño;
    }

    public JTextField getIngresarSlogan() {
        return IngresarSlogan;
    }

    public void setIngresarSlogan(JTextField IngresarSlogan) {
        this.IngresarSlogan = IngresarSlogan;
    }

    public JComboBox<String> getMes() {
        return Mes;
    }

    public void setMes(JComboBox<String> Mes) {
        this.Mes = Mes;
    }

    public JRadioButton getMujer() {
        return Mujer;
    }

    public void setMujer(JRadioButton Mujer) {
        this.Mujer = Mujer;
    }

    public JTextField getNom() {
        return Nom;
    }

    public void setNom(JTextField Nom) {
        this.Nom = Nom;
    }

    public JLabel getNomUE() {
        return NomUE;
    }

    public void setNomUE(JLabel NomUE) {
        this.NomUE = NomUE;
    }

    public JPanel getPanelPlegableAñadir() {
        return PanelPlegableAñadir;
    }

    public void setPanelPlegableAñadir(JPanel PanelPlegableAñadir) {
        this.PanelPlegableAñadir = PanelPlegableAñadir;
    }

    public JLabel getSeguridadUE1() {
        return SeguridadUE1;
    }

    public void setSeguridadUE1(JLabel SeguridadUE1) {
        this.SeguridadUE1 = SeguridadUE1;
    }

    public JButton getSeleccionarAño() {
        return SeleccionarAño;
    }

    public void setSeleccionarAño(JButton SeleccionarAño) {
        this.SeleccionarAño = SeleccionarAño;
    }

    public JLabel getSloganUE() {
        return SloganUE;
    }

    public void setSloganUE(JLabel SloganUE) {
        this.SloganUE = SloganUE;
    }

    public JComboBox<String> getTipoCorreo() {
        return TipoCorreo;
    }

    public void setTipoCorreo(JComboBox<String> TipoCorreo) {
        this.TipoCorreo = TipoCorreo;
    }

    public JLabel getValidarCantidadDeContraseña() {
        return ValidarCantidadDeContraseña;
    }

    public void setValidarCantidadDeContraseña(JLabel ValidarCantidadDeContraseña) {
        this.ValidarCantidadDeContraseña = ValidarCantidadDeContraseña;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GeneroGroup = new javax.swing.ButtonGroup();
        PanelPlegableAñadir = new javax.swing.JPanel();
        IngresarSlogan = new javax.swing.JTextField();
        SloganUE = new javax.swing.JLabel();
        SeguridadUE1 = new javax.swing.JLabel();
        ContraseñaOculta = new javax.swing.JPasswordField();
        Correo = new javax.swing.JTextField();
        CorreoUE = new javax.swing.JLabel();
        TipoCorreo = new javax.swing.JComboBox<>();
        ArrobaUE = new javax.swing.JTextField();
        Extencion = new javax.swing.JComboBox<>();
        ContraseñaVisible = new javax.swing.JTextField();
        SeleccionarAño = new javax.swing.JButton();
        IngresarAño = new javax.swing.JButton();
        AñoSpinner = new javax.swing.JSpinner();
        Año = new javax.swing.JComboBox<>();
        FAñoUE = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox<>();
        FMesUE = new javax.swing.JLabel();
        Dia = new javax.swing.JComboBox<>();
        FDiaUE = new javax.swing.JLabel();
        EdadUE = new javax.swing.JLabel();
        Mujer = new javax.swing.JRadioButton();
        Hombre = new javax.swing.JRadioButton();
        GeneroUE = new javax.swing.JLabel();
        ApellidoUE = new javax.swing.JLabel();
        Apdo = new javax.swing.JTextField();
        Nom = new javax.swing.JTextField();
        NomUE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Añadir = new javax.swing.JButton();
        ValidarCantidadDeContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        PanelPlegableAñadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IngresarSlogan.setText("Escribir...");
        IngresarSlogan.setAutoscrolls(false);
        IngresarSlogan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        IngresarSlogan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IngresarSloganFocusGained(evt);
            }
        });
        IngresarSlogan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarSloganMouseClicked(evt);
            }
        });
        PanelPlegableAñadir.add(IngresarSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 200, 20));

        SloganUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SloganUE.setText("Slogan:");
        PanelPlegableAñadir.add(SloganUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, 20));

        SeguridadUE1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SeguridadUE1.setText("Contraseña:");
        PanelPlegableAñadir.add(SeguridadUE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 20));

        ContraseñaOculta.setText("Escribir...");
        ContraseñaOculta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContraseñaOcultaFocusGained(evt);
            }
        });
        ContraseñaOculta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaOcultaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContraseñaOcultaMouseExited(evt);
            }
        });
        ContraseñaOculta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaOcultaActionPerformed(evt);
            }
        });
        ContraseñaOculta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñaOcultaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseñaOcultaKeyTyped(evt);
            }
        });
        PanelPlegableAñadir.add(ContraseñaOculta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 200, -1));

        Correo.setText("Escribir...");
        Correo.setAutoscrolls(false);
        Correo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CorreoFocusGained(evt);
            }
        });
        Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorreoMouseClicked(evt);
            }
        });
        Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoKeyTyped(evt);
            }
        });
        PanelPlegableAñadir.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 180, 20));

        CorreoUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CorreoUE.setText("Correo Electronico:");
        PanelPlegableAñadir.add(CorreoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        TipoCorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hotmail", "gmail", "mail.edu" }));
        TipoCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelPlegableAñadir.add(TipoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 20));

        ArrobaUE.setEditable(false);
        ArrobaUE.setText("@");
        ArrobaUE.setAutoscrolls(false);
        ArrobaUE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArrobaUEMouseClicked(evt);
            }
        });
        ArrobaUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrobaUEActionPerformed(evt);
            }
        });
        PanelPlegableAñadir.add(ArrobaUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 20, 20));

        Extencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".com", ".co", ".org", ".es", ".es.tl" }));
        Extencion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelPlegableAñadir.add(Extencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 60, 20));

        ContraseñaVisible.setEditable(false);
        ContraseñaVisible.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelPlegableAñadir.add(ContraseñaVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 120, -1));

        SeleccionarAño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CerrarVentana.png"))); // NOI18N
        SeleccionarAño.setText("Cancelar");
        SeleccionarAño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleccionarAño.setOpaque(false);
        SeleccionarAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarAñoActionPerformed(evt);
            }
        });
        PanelPlegableAñadir.add(SeleccionarAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        IngresarAño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        IngresarAño.setText("Guardar");
        IngresarAño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresarAño.setOpaque(false);
        IngresarAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarAñoActionPerformed(evt);
            }
        });
        PanelPlegableAñadir.add(IngresarAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, -1));

        AñoSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AñoSpinner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AñoSpinnerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñoSpinnerKeyTyped(evt);
            }
        });
        PanelPlegableAñadir.add(AñoSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 60, 20));

        Año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "Digitar" }));
        Año.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Año.setOpaque(false);
        Año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoActionPerformed(evt);
            }
        });
        PanelPlegableAñadir.add(Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 70, 20));

        FAñoUE.setText("Año:");
        PanelPlegableAñadir.add(FAñoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        Mes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mes.setOpaque(false);
        Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesActionPerformed(evt);
            }
        });
        PanelPlegableAñadir.add(Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 110, 20));

        FMesUE.setText("Mes:");
        PanelPlegableAñadir.add(FMesUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dia.setOpaque(false);
        Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaActionPerformed(evt);
            }
        });
        PanelPlegableAñadir.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 50, 20));

        FDiaUE.setText("Dia:");
        PanelPlegableAñadir.add(FDiaUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        EdadUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EdadUE.setText("Fecha de Nacimiento:");
        PanelPlegableAñadir.add(EdadUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        GeneroGroup.add(Mujer);
        Mujer.setText("Mujer");
        Mujer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelPlegableAñadir.add(Mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        GeneroGroup.add(Hombre);
        Hombre.setSelected(true);
        Hombre.setText("Hombre");
        Hombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelPlegableAñadir.add(Hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        GeneroUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        GeneroUE.setText("Genero:");
        PanelPlegableAñadir.add(GeneroUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        ApellidoUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ApellidoUE.setText("Apellido/s:");
        PanelPlegableAñadir.add(ApellidoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        Apdo.setText("Escribir...");
        Apdo.setAutoscrolls(false);
        Apdo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ApdoFocusGained(evt);
            }
        });
        Apdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApdoMouseClicked(evt);
            }
        });
        Apdo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ApdoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApdoKeyTyped(evt);
            }
        });
        PanelPlegableAñadir.add(Apdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, -1));

        Nom.setText("Escribir...");
        Nom.setAutoscrolls(false);
        Nom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NomFocusGained(evt);
            }
        });
        Nom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomMouseClicked(evt);
            }
        });
        Nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomKeyTyped(evt);
            }
        });
        PanelPlegableAñadir.add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, -1));

        NomUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NomUE.setText("Nombre/s:");
        PanelPlegableAñadir.add(NomUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/go_previous.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        PanelPlegableAñadir.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 4, 20, -1));

        Añadir.setBackground(new java.awt.Color(51, 51, 255));
        Añadir.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Añadir.setForeground(new java.awt.Color(255, 255, 255));
        Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_add.png"))); // NOI18N
        Añadir.setText("Añadir");
        Añadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        Añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Añadir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        PanelPlegableAñadir.add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 120, 30));

        ValidarCantidadDeContraseña.setForeground(new java.awt.Color(255, 0, 0));
        PanelPlegableAñadir.add(ValidarCantidadDeContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 200, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPlegableAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPlegableAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaOcultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaOcultaFocusGained

        AAF.MouseClickContraseñaOculta();

    }//GEN-LAST:event_ContraseñaOcultaFocusGained

    private void ContraseñaOcultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaOcultaMouseClicked

        AAF.MouseClickContraseñaOculta();
        
    }//GEN-LAST:event_ContraseñaOcultaMouseClicked

    private void ContraseñaOcultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaOcultaMouseExited

        ContraseñaVisible.setText(ContraseñaOculta.getText());
        
    }//GEN-LAST:event_ContraseñaOcultaMouseExited

    private void ContraseñaOcultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaOcultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaOcultaActionPerformed

    private void ContraseñaOcultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaOcultaKeyPressed

        ContraseñaVisible.setText(ContraseñaOculta.getText());
        
        AAF.ValidarBtnEnterContraseñaOculta(evt);
        
    }//GEN-LAST:event_ContraseñaOcultaKeyPressed

    private void ContraseñaOcultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaOcultaKeyTyped

    }//GEN-LAST:event_ContraseñaOcultaKeyTyped

    private void ArrobaUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArrobaUEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrobaUEMouseClicked

    private void ArrobaUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrobaUEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrobaUEActionPerformed

    private void SeleccionarAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarAñoActionPerformed

        Año.setSelectedItem("2018");
        AñoSpinner.setVisible(false);
        SeleccionarAño.setVisible(false);
        IngresarAño.setVisible(false);
        Año.setEnabled(true);
        
    }//GEN-LAST:event_SeleccionarAñoActionPerformed

    private void IngresarAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarAñoActionPerformed

        AAF.AñadirAño();
        
    }//GEN-LAST:event_IngresarAñoActionPerformed

    private void AñoSpinnerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoSpinnerKeyPressed

        AAF.BloquearPegadoAltYShitf(evt);
        
    }//GEN-LAST:event_AñoSpinnerKeyPressed

    private void AñoSpinnerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoSpinnerKeyTyped

        AAF.ValidarSolamenteNumeros(evt);
        
    }//GEN-LAST:event_AñoSpinnerKeyTyped

    private void AñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoActionPerformed

        AAF.HabilitarYDeshabilitarAño();
        
    }//GEN-LAST:event_AñoActionPerformed

    private void MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesActionPerformed

        AAF.ValidarDiasDeFebrero();
        
    }//GEN-LAST:event_MesActionPerformed

    private void DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaActionPerformed

        AAF.ValidarDiasDeFebrero();
        
    }//GEN-LAST:event_DiaActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        dispose();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
            
        
        boolean registroExitoso=false;
            try {
                registroExitoso = this.Adm.getIniciar().getPrincipal().getNegocio().guardarUsuario(this.Nom.getText(), this.Apdo.getText(), this.sacarSexo(), this.ValidarFecha(), this.CorreoCompleto(), validarContraseña(ContraseñaOculta.getPassword()),cargar.getUrlPerfil(),cargar.getUrlPortada(),IngresarSlogan.getText(),null,null,null, null );
        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
    }//GEN-LAST:event_AñadirActionPerformed

    private String sacarSexo(){
        
        String aux="";
        
        if (this.Hombre.isSelected()) {
            
            aux="Hombre";
        
        }else{
            
            aux="Mujer";
            
        }
        
        return aux;
        
    }
 
    private String ValidarFecha(){
    
        String Fecha = Dia.getSelectedItem().toString()+"/"+Mes.getSelectedItem().toString()+"/"+Año.getSelectedItem().toString();
        
        return Fecha;
    }
    
    private String CorreoCompleto(){
        
        String CC=Correo.getText()+"@"+TipoCorreo.getSelectedItem().toString()+Extencion.getSelectedItem().toString();
    
        return CC;
    }
    
    private String validarContraseña(char[] contra){
        
        String aux="";
        
        for (int i = 0; i < contra.length; i++) {
            
            aux+=contra[i];
            
        }
        
        return aux;
    }
    
    private void NomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomMouseClicked
        
        AAF.MouseClickNombre();
        
    }//GEN-LAST:event_NomMouseClicked

    private void NomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NomFocusGained
        
        AAF.MouseClickNombre();
        
    }//GEN-LAST:event_NomFocusGained

    private void ApdoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApdoMouseClicked
        
        AAF.MouseClickApdo();
        
    }//GEN-LAST:event_ApdoMouseClicked

    private void ApdoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApdoFocusGained
        
        AAF.MouseClickApdo();
        
    }//GEN-LAST:event_ApdoFocusGained

    private void CorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMouseClicked
        
        AAF.MouseClickCorreo();
                
    }//GEN-LAST:event_CorreoMouseClicked

    private void CorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CorreoFocusGained
        
        AAF.MouseClickCorreo();
        
    }//GEN-LAST:event_CorreoFocusGained

    private void NomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomKeyPressed
        
        AAF.ValidarBtnEnterNombre(evt);
        
    }//GEN-LAST:event_NomKeyPressed

    private void ApdoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApdoKeyPressed
        
        AAF.ValidarBtnEnterApdo(evt);
        
    }//GEN-LAST:event_ApdoKeyPressed

    private void CorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoKeyPressed
        
        AAF.ValidarBtnEnterCorreo(evt);
        
    }//GEN-LAST:event_CorreoKeyPressed

    private void NomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomKeyTyped
        
        AAF.ValidarSolamenteLetras(evt);
        
    }//GEN-LAST:event_NomKeyTyped

    private void ApdoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApdoKeyTyped
        
        AAF.ValidarSolamenteLetras(evt);
        
    }//GEN-LAST:event_ApdoKeyTyped

    private void CorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoKeyTyped
        
        AAF.ValidarNumerosYLetras(evt);
        
    }//GEN-LAST:event_CorreoKeyTyped

    private void IngresarSloganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarSloganMouseClicked
        
        AAF.MouseClickSlogan();
        
    }//GEN-LAST:event_IngresarSloganMouseClicked

    private void IngresarSloganFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IngresarSloganFocusGained
        
        AAF.MouseClickSlogan();
        
    }//GEN-LAST:event_IngresarSloganFocusGained

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apdo;
    private javax.swing.JLabel ApellidoUE;
    public static javax.swing.JTextField ArrobaUE;
    private javax.swing.JButton Añadir;
    private javax.swing.JComboBox<String> Año;
    private javax.swing.JSpinner AñoSpinner;
    private javax.swing.JPasswordField ContraseñaOculta;
    private javax.swing.JTextField ContraseñaVisible;
    private javax.swing.JTextField Correo;
    private javax.swing.JLabel CorreoUE;
    private javax.swing.JComboBox<String> Dia;
    public static javax.swing.JLabel EdadUE;
    private javax.swing.JComboBox<String> Extencion;
    private javax.swing.JLabel FAñoUE;
    private javax.swing.JLabel FDiaUE;
    private javax.swing.JLabel FMesUE;
    public static javax.swing.ButtonGroup GeneroGroup;
    public static javax.swing.JLabel GeneroUE;
    private javax.swing.JRadioButton Hombre;
    private javax.swing.JButton IngresarAño;
    private javax.swing.JTextField IngresarSlogan;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JRadioButton Mujer;
    private javax.swing.JTextField Nom;
    private javax.swing.JLabel NomUE;
    private javax.swing.JPanel PanelPlegableAñadir;
    private javax.swing.JLabel SeguridadUE1;
    private javax.swing.JButton SeleccionarAño;
    private javax.swing.JLabel SloganUE;
    private javax.swing.JComboBox<String> TipoCorreo;
    private javax.swing.JLabel ValidarCantidadDeContraseña;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
