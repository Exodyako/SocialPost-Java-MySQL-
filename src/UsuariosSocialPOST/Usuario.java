
package UsuariosSocialPOST;

import Clases.CargarArchivos;
import Clases.RegistrarseFunciones;
import static Clases.RegistrarseFunciones.Entrar;
import Clases.UsuarioFunciones;
import GUIS.IniciarSesion;
import GUIS.Principal;
import static GUIS.Principal.Contador;
import static GUIS.Principal.Contador2;
import static GUIS.Registrarse.Portada;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.accessibility.AccessibleContext;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;


public class Usuario extends javax.swing.JFrame {
    
    UsuarioFunciones US = new UsuarioFunciones(this);
    CargarArchivos CA = new CargarArchivos(this);
    
    private IniciarSesion iniciar;
    
    public IniciarSesion getIniciar(){
        
        return iniciar;
        
    }
    
    CargarArchivos cargar = new CargarArchivos(this);
    
    public Usuario(IniciarSesion iniciar) {
        super("Sesion Iniciada");
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/SocialPostIcono.png")).getImage());
        initComponents();
        setLocationRelativeTo(this);
        this.iniciar=iniciar;
        
        ImageIcon ImagenBackground = new ImageIcon("src/Imagenes/FondoSocialPOST-Principal.jpg");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(PortadaUsuario.getWidth(), PortadaUsuario.getHeight(), Image.SCALE_DEFAULT));
        PortadaUsuario.setIcon(IconoBackground);
        
        ImageIcon ImagenBackground2 = new ImageIcon("src/Imagenes/FondoSocialPOST-Principal.jpg");
        Icon IconoBackground2 = new ImageIcon(ImagenBackground2.getImage().getScaledInstance(PortadaUsuario2.getWidth(), PortadaUsuario2.getHeight(), Image.SCALE_DEFAULT));
        PortadaUsuario2.setIcon(IconoBackground2);
        
        //PestañasUsuario.setEnabled(false);
        SeleccionarAñoUE.setVisible(false);
        AñoSpinnerUE.setVisible(false);
        IngresarAñoUE.setVisible(false);
        
        SpinnerNumberModel AS2 = new SpinnerNumberModel();
        AS2.setMinimum(1000);
        AS2.setValue(1000);
        AñoSpinnerUE.setModel(AS2);
        
        llenarLabelsDelPerfil();
        
        EditBtn.setVisible(false);
        EditBtn2.setVisible(false);
        
        CerrarVentana();
        
    }

    public Usuario(IniciarSesion iniciar, JLabel ApellidoUE, JPanel AñadirPanelUsuario, JButton BtnCargarFotoPerfilU, JButton BtnCargarFotoPortadaU, JLabel CargarFotoDePerfilTextU, JLabel CargarFotoDePerfilU, JLabel CargarFotoDePortadaTextU, JLabel CargarFotoDePortadaU, JMenuItem CerrarProgramaU, JMenuItem CerrarSesionU, JLabel CorreoUE, JLabel Cositos, JButton DesAñadir, JLabel DesPer, JLabel DesText, JTextArea DescripcionAU, JButton DescripcionEliminar, JButton DirAñadir, JLabel DirText, JLabel DirUA, JLabel DirUA1, JButton DireccionEliminar, JTextField DireccionUA, JLabel EditBtn, JLabel EditBtn2, JPanel EditarPanelUsuario, JPanel Eliminar, JLabel FAñoUE, JLabel FDiaUE, JLabel FMesUE, JButton FotoEliminar, JLabel FotoUsuario, JLabel FotoUsuario3, ButtonGroup GenerosGroupUE, JButton Gestionar1, JButton Gestionar2, JButton Gestionar3, JButton Gestionar4, JPanel ImportarPanelUsuario, JLabel Info, JLabel Informacion, JLabel Informacion1, JLabel Informacion2, JLabel Informacion3, JLabel Informacion4, JMenuBar MenuBarUsuario, JLabel NomUE, JLabel NombreUsuario, JPanel PerfilPanelUsuario, JTabbedPane PestañasUsuario, JButton PortadaEliminar, JLabel PortadaUsuario, JLabel PortadaUsuario3, JButton Regresar, JButton Regresar2, JButton Regresar3, JButton Regresar4, JLabel SeguridadUE1, JSeparator Separador2, JSeparator Separador3, JSeparator Separador4, JLabel SloText, JButton SloganEliminar, JLabel SloganUE, JTextField SloganUsuario, JButton TelAñadir, JLabel TelText, JLabel TelUA, JButton TelefonoEliminar, JTextField TelefonoUA, JLabel UsuarioBanner, JLabel UsuarioBannerAñadir, JLabel UsuarioBannerEditar, JLabel UsuarioBannerEliminar, JLabel UsuarioBannerImportar, JMenu UsuarioMenuUsuario, JLabel ValidarCantidadDeContraseñaUE, JTextField VisualizarContraseñaUE, JLabel correoUsuario, JLabel jLabel1, JLabel jLabel2, JMenu jMenu1, JMenuItem jMenuItem1, JScrollPane jScrollPane1, JScrollPane jScrollPane2, JTextArea jTextArea1) {
        this.iniciar = iniciar;
        this.ApellidoUE = ApellidoUE;
        this.AñadirPanelUsuario = AñadirPanelUsuario;
        this.BtnCargarFotoPerfilU = BtnCargarFotoPerfilU;
        this.BtnCargarFotoPortadaU = BtnCargarFotoPortadaU;
        this.CargarFotoDePerfilTextU = CargarFotoDePerfilTextU;
        this.CargarFotoDePerfilU = CargarFotoDePerfilU;
        this.CargarFotoDePortadaTextU = CargarFotoDePortadaTextU;
        this.CargarFotoDePortadaU = CargarFotoDePortadaU;
        this.CerrarProgramaU = CerrarProgramaU;
        this.CerrarSesionU = CerrarSesionU;
        this.CorreoUE = CorreoUE;
        this.Cositos = Cositos;
        this.DesAñadir = DesAñadir;
        this.DesPer = DesPer;
        this.DesText = DesText;
        this.DescripcionAU = DescripcionAU;
        this.DescripcionEliminar = DescripcionEliminar;
        this.DirAñadir = DirAñadir;
        this.DirText = DirText;
        this.DirUA = DirUA;
        this.DirUA1 = DirUA1;
        this.DireccionEliminar = DireccionEliminar;
        this.DireccionUA = DireccionUA;
        this.EditBtn = EditBtn;
        this.EditBtn2 = EditBtn2;
        this.EditarPanelUsuario = EditarPanelUsuario;
        this.Eliminar = Eliminar;
        this.FAñoUE = FAñoUE;
        this.FDiaUE = FDiaUE;
        this.FMesUE = FMesUE;
        this.FotoEliminar = FotoEliminar;
        this.FotoUsuario = FotoUsuario;
        this.FotoUsuario3 = FotoUsuario3;
        this.GenerosGroupUE = GenerosGroupUE;
        this.Gestionar1 = Gestionar1;
        this.Gestionar2 = Gestionar2;
        this.Gestionar3 = Gestionar3;
        this.Gestionar4 = Gestionar4;
        this.ImportarPanelUsuario = ImportarPanelUsuario;
        this.Info = Info;
        this.Informacion = Informacion;
        this.Informacion1 = Informacion1;
        this.Informacion2 = Informacion2;
        this.Informacion3 = Informacion3;
        this.Informacion4 = Informacion4;
        this.MenuBarUsuario = MenuBarUsuario;
        this.NomUE = NomUE;
        this.NombreUsuario = NombreUsuario;
        this.PerfilPanelUsuario = PerfilPanelUsuario;
        this.PestañasUsuario = PestañasUsuario;
        this.PortadaEliminar = PortadaEliminar;
        this.PortadaUsuario = PortadaUsuario;
        this.PortadaUsuario3 = PortadaUsuario3;
        this.Regresar = Regresar;
        this.Regresar2 = Regresar2;
        this.Regresar3 = Regresar3;
        this.Regresar4 = Regresar4;
        this.SeguridadUE1 = SeguridadUE1;
        this.Separador2 = Separador2;
        this.Separador3 = Separador3;
        this.Separador4 = Separador4;
        this.SloText = SloText;
        this.SloganEliminar = SloganEliminar;
        this.SloganUE = SloganUE;
        this.SloganUsuario = SloganUsuario;
        this.TelAñadir = TelAñadir;
        this.TelText = TelText;
        this.TelUA = TelUA;
        this.TelefonoEliminar = TelefonoEliminar;
        this.TelefonoUA = TelefonoUA;
        this.UsuarioBanner = UsuarioBanner;
        this.UsuarioBannerAñadir = UsuarioBannerAñadir;
        this.UsuarioBannerEditar = UsuarioBannerEditar;
        this.UsuarioBannerEliminar = UsuarioBannerEliminar;
        this.UsuarioBannerImportar = UsuarioBannerImportar;
        this.UsuarioMenuUsuario = UsuarioMenuUsuario;
        this.ValidarCantidadDeContraseñaUE = ValidarCantidadDeContraseñaUE;
        this.VisualizarContraseñaUE = VisualizarContraseñaUE;
        this.correoUsuario = correoUsuario;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jMenu1 = jMenu1;
        this.jMenuItem1 = jMenuItem1;
        this.jScrollPane1 = jScrollPane1;
        this.jScrollPane2 = jScrollPane2;
        this.jTextArea1 = jTextArea1;
    }

    public UsuarioFunciones getUS() {
        return US;
    }

    public void setUS(UsuarioFunciones US) {
        this.US = US;
    }

    public static JButton getApdoEditado() {
        return ApdoEditado;
    }

    public static void setApdoEditado(JButton ApdoEditado) {
        Usuario.ApdoEditado = ApdoEditado;
    }

    public static JTextField getApdoUE() {
        return ApdoUE;
    }

    public static void setApdoUE(JTextField ApdoUE) {
        Usuario.ApdoUE = ApdoUE;
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
        Usuario.ArrobaUE = ArrobaUE;
    }

    public JPanel getAñadirPanelUsuario() {
        return AñadirPanelUsuario;
    }

    public void setAñadirPanelUsuario(JPanel AñadirPanelUsuario) {
        this.AñadirPanelUsuario = AñadirPanelUsuario;
    }

    public static JSpinner getAñoSpinnerUE() {
        return AñoSpinnerUE;
    }

    public static void setAñoSpinnerUE(JSpinner AñoSpinnerUE) {
        Usuario.AñoSpinnerUE = AñoSpinnerUE;
    }

    public static JComboBox<String> getAñoUE() {
        return AñoUE;
    }

    public static void setAñoUE(JComboBox<String> AñoUE) {
        Usuario.AñoUE = AñoUE;
    }

    public JButton getBtnCargarFotoPerfilU() {
        return BtnCargarFotoPerfilU;
    }

    public void setBtnCargarFotoPerfilU(JButton BtnCargarFotoPerfilU) {
        this.BtnCargarFotoPerfilU = BtnCargarFotoPerfilU;
    }

    public JButton getBtnCargarFotoPortadaU() {
        return BtnCargarFotoPortadaU;
    }

    public void setBtnCargarFotoPortadaU(JButton BtnCargarFotoPortadaU) {
        this.BtnCargarFotoPortadaU = BtnCargarFotoPortadaU;
    }

    public JLabel getCargarFotoDePerfilTextU() {
        return CargarFotoDePerfilTextU;
    }

    public void setCargarFotoDePerfilTextU(JLabel CargarFotoDePerfilTextU) {
        this.CargarFotoDePerfilTextU = CargarFotoDePerfilTextU;
    }

    public JLabel getCargarFotoDePerfilU() {
        return CargarFotoDePerfilU;
    }

    public void setCargarFotoDePerfilU(JLabel CargarFotoDePerfilU) {
        this.CargarFotoDePerfilU = CargarFotoDePerfilU;
    }

    public JLabel getCargarFotoDePortadaTextU() {
        return CargarFotoDePortadaTextU;
    }

    public void setCargarFotoDePortadaTextU(JLabel CargarFotoDePortadaTextU) {
        this.CargarFotoDePortadaTextU = CargarFotoDePortadaTextU;
    }

    public JLabel getCargarFotoDePortadaU() {
        return CargarFotoDePortadaU;
    }

    public void setCargarFotoDePortadaU(JLabel CargarFotoDePortadaU) {
        this.CargarFotoDePortadaU = CargarFotoDePortadaU;
    }

    public JMenuItem getCerrarProgramaU() {
        return CerrarProgramaU;
    }

    public void setCerrarProgramaU(JMenuItem CerrarProgramaU) {
        this.CerrarProgramaU = CerrarProgramaU;
    }

    public JMenuItem getCerrarSesionU() {
        return CerrarSesionU;
    }

    public void setCerrarSesionU(JMenuItem CerrarSesionU) {
        this.CerrarSesionU = CerrarSesionU;
    }

    public static JButton getContraseñaEditado() {
        return ContraseñaEditado;
    }

    public static void setContraseñaEditado(JButton ContraseñaEditado) {
        Usuario.ContraseñaEditado = ContraseñaEditado;
    }

    public static JPasswordField getContraseñaOcultaUE() {
        return ContraseñaOcultaUE;
    }

    public static void setContraseñaOcultaUE(JPasswordField ContraseñaOcultaUE) {
        Usuario.ContraseñaOcultaUE = ContraseñaOcultaUE;
    }

    public static JTextField getContraseñaVisibleEU() {
        return ContraseñaVisibleEU;
    }

    public static void setContraseñaVisibleEU(JTextField ContraseñaVisibleEU) {
        Usuario.ContraseñaVisibleEU = ContraseñaVisibleEU;
    }

    public static JButton getCorreoEditado() {
        return CorreoEditado;
    }

    public static void setCorreoEditado(JButton CorreoEditado) {
        Usuario.CorreoEditado = CorreoEditado;
    }

    public static JTextField getCorreoElectronicoUE() {
        return CorreoElectronicoUE;
    }

    public static void setCorreoElectronicoUE(JTextField CorreoElectronicoUE) {
        Usuario.CorreoElectronicoUE = CorreoElectronicoUE;
    }

    public JLabel getCorreoUE() {
        return CorreoUE;
    }

    public void setCorreoUE(JLabel CorreoUE) {
        this.CorreoUE = CorreoUE;
    }

    public JLabel getCositos() {
        return Cositos;
    }

    public void setCositos(JLabel Cositos) {
        this.Cositos = Cositos;
    }

    public JButton getDesAñadir() {
        return DesAñadir;
    }

    public void setDesAñadir(JButton DesAñadir) {
        this.DesAñadir = DesAñadir;
    }

    public JLabel getDesPer() {
        return DesPer;
    }

    public void setDesPer(JLabel DesPer) {
        this.DesPer = DesPer;
    }

    public JLabel getDesText() {
        return DesText;
    }

    public void setDesText(JLabel DesText) {
        this.DesText = DesText;
    }

    public JTextArea getDescripcionAU() {
        return DescripcionAU;
    }

    public void setDescripcionAU(JTextArea DescripcionAU) {
        this.DescripcionAU = DescripcionAU;
    }

    public JButton getDescripcionEliminar() {
        return DescripcionEliminar;
    }

    public void setDescripcionEliminar(JButton DescripcionEliminar) {
        this.DescripcionEliminar = DescripcionEliminar;
    }

    public static JComboBox<String> getDiaUE() {
        return DiaUE;
    }

    public static void setDiaUE(JComboBox<String> DiaUE) {
        Usuario.DiaUE = DiaUE;
    }

    public JButton getDirAñadir() {
        return DirAñadir;
    }

    public void setDirAñadir(JButton DirAñadir) {
        this.DirAñadir = DirAñadir;
    }

    public JLabel getDirText() {
        return DirText;
    }

    public void setDirText(JLabel DirText) {
        this.DirText = DirText;
    }

    public JLabel getDirUA() {
        return DirUA;
    }

    public void setDirUA(JLabel DirUA) {
        this.DirUA = DirUA;
    }

    public JLabel getDirUA1() {
        return DirUA1;
    }

    public void setDirUA1(JLabel DirUA1) {
        this.DirUA1 = DirUA1;
    }

    public JButton getDireccionEliminar() {
        return DireccionEliminar;
    }

    public void setDireccionEliminar(JButton DireccionEliminar) {
        this.DireccionEliminar = DireccionEliminar;
    }

    public JTextField getDireccionUA() {
        return DireccionUA;
    }

    public void setDireccionUA(JTextField DireccionUA) {
        this.DireccionUA = DireccionUA;
    }

    public static JLabel getEdadUE() {
        return EdadUE;
    }

    public static void setEdadUE(JLabel EdadUE) {
        Usuario.EdadUE = EdadUE;
    }

    public JLabel getEditBtn() {
        return EditBtn;
    }

    public void setEditBtn(JLabel EditBtn) {
        this.EditBtn = EditBtn;
    }

    public JLabel getEditBtn2() {
        return EditBtn2;
    }

    public void setEditBtn2(JLabel EditBtn2) {
        this.EditBtn2 = EditBtn2;
    }

    public JPanel getEditarPanelUsuario() {
        return EditarPanelUsuario;
    }

    public void setEditarPanelUsuario(JPanel EditarPanelUsuario) {
        this.EditarPanelUsuario = EditarPanelUsuario;
    }

    public JPanel getEliminar() {
        return Eliminar;
    }

    public void setEliminar(JPanel Eliminar) {
        this.Eliminar = Eliminar;
    }

    public static JComboBox<String> getExtencionUE() {
        return ExtencionUE;
    }

    public static void setExtencionUE(JComboBox<String> ExtencionUE) {
        Usuario.ExtencionUE = ExtencionUE;
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

    public static JButton getFechaEditado() {
        return FechaEditado;
    }

    public static void setFechaEditado(JButton FechaEditado) {
        Usuario.FechaEditado = FechaEditado;
    }

    public JButton getFotoEliminar() {
        return FotoEliminar;
    }

    public void setFotoEliminar(JButton FotoEliminar) {
        this.FotoEliminar = FotoEliminar;
    }

    public JLabel getFotoUsuario() {
        return FotoUsuario;
    }

    public void setFotoUsuario(JLabel FotoUsuario) {
        this.FotoUsuario = FotoUsuario;
    }

    public static JLabel getFotoUsuario2() {
        return FotoUsuario2;
    }

    public static void setFotoUsuario2(JLabel FotoUsuario2) {
        Usuario.FotoUsuario2 = FotoUsuario2;
    }

    public JLabel getFotoUsuario3() {
        return FotoUsuario3;
    }

    public void setFotoUsuario3(JLabel FotoUsuario3) {
        this.FotoUsuario3 = FotoUsuario3;
    }

    public static JButton getGeneroEditado() {
        return GeneroEditado;
    }

    public static void setGeneroEditado(JButton GeneroEditado) {
        Usuario.GeneroEditado = GeneroEditado;
    }

    public static JLabel getGeneroUE() {
        return GeneroUE;
    }

    public static void setGeneroUE(JLabel GeneroUE) {
        Usuario.GeneroUE = GeneroUE;
    }

    public ButtonGroup getGenerosGroupUE() {
        return GenerosGroupUE;
    }

    public void setGenerosGroupUE(ButtonGroup GenerosGroupUE) {
        this.GenerosGroupUE = GenerosGroupUE;
    }

    public JButton getGestionar1() {
        return Gestionar1;
    }

    public void setGestionar1(JButton Gestionar1) {
        this.Gestionar1 = Gestionar1;
    }

    public JButton getGestionar2() {
        return Gestionar2;
    }

    public void setGestionar2(JButton Gestionar2) {
        this.Gestionar2 = Gestionar2;
    }

    public JButton getGestionar3() {
        return Gestionar3;
    }

    public void setGestionar3(JButton Gestionar3) {
        this.Gestionar3 = Gestionar3;
    }

    public JButton getGestionar4() {
        return Gestionar4;
    }

    public void setGestionar4(JButton Gestionar4) {
        this.Gestionar4 = Gestionar4;
    }

    public static JRadioButton getHombreUE() {
        return HombreUE;
    }

    public static void setHombreUE(JRadioButton HombreUE) {
        Usuario.HombreUE = HombreUE;
    }

    public JPanel getImportarPanelUsuario() {
        return ImportarPanelUsuario;
    }

    public void setImportarPanelUsuario(JPanel ImportarPanelUsuario) {
        this.ImportarPanelUsuario = ImportarPanelUsuario;
    }

    public JLabel getInfo() {
        return Info;
    }

    public void setInfo(JLabel Info) {
        this.Info = Info;
    }

    public JLabel getInformacion() {
        return Informacion;
    }

    public void setInformacion(JLabel Informacion) {
        this.Informacion = Informacion;
    }

    public JLabel getInformacion1() {
        return Informacion1;
    }

    public void setInformacion1(JLabel Informacion1) {
        this.Informacion1 = Informacion1;
    }

    public JLabel getInformacion2() {
        return Informacion2;
    }

    public void setInformacion2(JLabel Informacion2) {
        this.Informacion2 = Informacion2;
    }

    public JLabel getInformacion3() {
        return Informacion3;
    }

    public void setInformacion3(JLabel Informacion3) {
        this.Informacion3 = Informacion3;
    }

    public JLabel getInformacion4() {
        return Informacion4;
    }

    public void setInformacion4(JLabel Informacion4) {
        this.Informacion4 = Informacion4;
    }

    public static JButton getIngresarAñoUE() {
        return IngresarAñoUE;
    }

    public static void setIngresarAñoUE(JButton IngresarAñoUE) {
        Usuario.IngresarAñoUE = IngresarAñoUE;
    }

    public JMenuBar getMenuBarUsuario() {
        return MenuBarUsuario;
    }

    public void setMenuBarUsuario(JMenuBar MenuBarUsuario) {
        this.MenuBarUsuario = MenuBarUsuario;
    }

    public static JComboBox<String> getMesUE() {
        return MesUE;
    }

    public static void setMesUE(JComboBox<String> MesUE) {
        Usuario.MesUE = MesUE;
    }

    public static JRadioButton getMujerUE() {
        return MujerUE;
    }

    public static void setMujerUE(JRadioButton MujerUE) {
        Usuario.MujerUE = MujerUE;
    }

    public static JButton getNomEditador() {
        return NomEditador;
    }

    public static void setNomEditador(JButton NomEditador) {
        Usuario.NomEditador = NomEditador;
    }

    public JLabel getNomUE() {
        return NomUE;
    }

    public void setNomUE(JLabel NomUE) {
        this.NomUE = NomUE;
    }

    public static JTextField getNombreUE() {
        return NombreUE;
    }

    public static void setNombreUE(JTextField NombreUE) {
        Usuario.NombreUE = NombreUE;
    }

    public JLabel getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(JLabel NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public JPanel getPerfilPanelUsuario() {
        return PerfilPanelUsuario;
    }

    public void setPerfilPanelUsuario(JPanel PerfilPanelUsuario) {
        this.PerfilPanelUsuario = PerfilPanelUsuario;
    }

    public JTabbedPane getPestañasUsuario() {
        return PestañasUsuario;
    }

    public void setPestañasUsuario(JTabbedPane PestañasUsuario) {
        this.PestañasUsuario = PestañasUsuario;
    }

    public JButton getPortadaEliminar() {
        return PortadaEliminar;
    }

    public void setPortadaEliminar(JButton PortadaEliminar) {
        this.PortadaEliminar = PortadaEliminar;
    }

    public JLabel getPortadaUsuario() {
        return PortadaUsuario;
    }

    public void setPortadaUsuario(JLabel PortadaUsuario) {
        this.PortadaUsuario = PortadaUsuario;
    }

    public static JLabel getPortadaUsuario2() {
        return PortadaUsuario2;
    }

    public static void setPortadaUsuario2(JLabel PortadaUsuario2) {
        Usuario.PortadaUsuario2 = PortadaUsuario2;
    }

    public JLabel getPortadaUsuario3() {
        return PortadaUsuario3;
    }

    public void setPortadaUsuario3(JLabel PortadaUsuario3) {
        this.PortadaUsuario3 = PortadaUsuario3;
    }

    public JButton getRegresar() {
        return Regresar;
    }

    public void setRegresar(JButton Regresar) {
        this.Regresar = Regresar;
    }

    public JButton getRegresar2() {
        return Regresar2;
    }

    public void setRegresar2(JButton Regresar2) {
        this.Regresar2 = Regresar2;
    }

    public JButton getRegresar3() {
        return Regresar3;
    }

    public void setRegresar3(JButton Regresar3) {
        this.Regresar3 = Regresar3;
    }

    public JButton getRegresar4() {
        return Regresar4;
    }

    public void setRegresar4(JButton Regresar4) {
        this.Regresar4 = Regresar4;
    }

    public JLabel getSeguridadUE1() {
        return SeguridadUE1;
    }

    public void setSeguridadUE1(JLabel SeguridadUE1) {
        this.SeguridadUE1 = SeguridadUE1;
    }

    public static JButton getSeleccionarAñoUE() {
        return SeleccionarAñoUE;
    }

    public static void setSeleccionarAñoUE(JButton SeleccionarAñoUE) {
        Usuario.SeleccionarAñoUE = SeleccionarAñoUE;
    }

    public JSeparator getSeparador2() {
        return Separador2;
    }

    public void setSeparador2(JSeparator Separador2) {
        this.Separador2 = Separador2;
    }

    public JSeparator getSeparador3() {
        return Separador3;
    }

    public void setSeparador3(JSeparator Separador3) {
        this.Separador3 = Separador3;
    }

    public JSeparator getSeparador4() {
        return Separador4;
    }

    public void setSeparador4(JSeparator Separador4) {
        this.Separador4 = Separador4;
    }

    public static JTextField getSgUE() {
        return SgUE;
    }

    public static void setSgUE(JTextField SgUE) {
        Usuario.SgUE = SgUE;
    }

    public JLabel getSloText() {
        return SloText;
    }

    public void setSloText(JLabel SloText) {
        this.SloText = SloText;
    }

    public static JButton getSloganEditado() {
        return SloganEditado;
    }

    public static void setSloganEditado(JButton SloganEditado) {
        Usuario.SloganEditado = SloganEditado;
    }

    public JButton getSloganEliminar() {
        return SloganEliminar;
    }

    public void setSloganEliminar(JButton SloganEliminar) {
        this.SloganEliminar = SloganEliminar;
    }

    public JLabel getSloganUE() {
        return SloganUE;
    }

    public void setSloganUE(JLabel SloganUE) {
        this.SloganUE = SloganUE;
    }

    public JTextField getSloganUsuario() {
        return SloganUsuario;
    }

    public void setSloganUsuario(JTextField SloganUsuario) {
        this.SloganUsuario = SloganUsuario;
    }

    public JButton getTelAñadir() {
        return TelAñadir;
    }

    public void setTelAñadir(JButton TelAñadir) {
        this.TelAñadir = TelAñadir;
    }

    public JLabel getTelText() {
        return TelText;
    }

    public void setTelText(JLabel TelText) {
        this.TelText = TelText;
    }

    public JLabel getTelUA() {
        return TelUA;
    }

    public void setTelUA(JLabel TelUA) {
        this.TelUA = TelUA;
    }

    public JButton getTelefonoEliminar() {
        return TelefonoEliminar;
    }

    public void setTelefonoEliminar(JButton TelefonoEliminar) {
        this.TelefonoEliminar = TelefonoEliminar;
    }

    public JTextField getTelefonoUA() {
        return TelefonoUA;
    }

    public void setTelefonoUA(JTextField TelefonoUA) {
        this.TelefonoUA = TelefonoUA;
    }

    public static JComboBox<String> getTipoCorreoUE() {
        return TipoCorreoUE;
    }

    public static void setTipoCorreoUE(JComboBox<String> TipoCorreoUE) {
        Usuario.TipoCorreoUE = TipoCorreoUE;
    }

    public JLabel getUsuarioBanner() {
        return UsuarioBanner;
    }

    public void setUsuarioBanner(JLabel UsuarioBanner) {
        this.UsuarioBanner = UsuarioBanner;
    }

    public JLabel getUsuarioBannerAñadir() {
        return UsuarioBannerAñadir;
    }

    public void setUsuarioBannerAñadir(JLabel UsuarioBannerAñadir) {
        this.UsuarioBannerAñadir = UsuarioBannerAñadir;
    }

    public JLabel getUsuarioBannerEditar() {
        return UsuarioBannerEditar;
    }

    public void setUsuarioBannerEditar(JLabel UsuarioBannerEditar) {
        this.UsuarioBannerEditar = UsuarioBannerEditar;
    }

    public JLabel getUsuarioBannerEliminar() {
        return UsuarioBannerEliminar;
    }

    public void setUsuarioBannerEliminar(JLabel UsuarioBannerEliminar) {
        this.UsuarioBannerEliminar = UsuarioBannerEliminar;
    }

    public JLabel getUsuarioBannerImportar() {
        return UsuarioBannerImportar;
    }

    public void setUsuarioBannerImportar(JLabel UsuarioBannerImportar) {
        this.UsuarioBannerImportar = UsuarioBannerImportar;
    }

    public JMenu getUsuarioMenuUsuario() {
        return UsuarioMenuUsuario;
    }

    public void setUsuarioMenuUsuario(JMenu UsuarioMenuUsuario) {
        this.UsuarioMenuUsuario = UsuarioMenuUsuario;
    }

    public JLabel getValidarCantidadDeContraseñaUE() {
        return ValidarCantidadDeContraseñaUE;
    }

    public void setValidarCantidadDeContraseñaUE(JLabel ValidarCantidadDeContraseñaUE) {
        this.ValidarCantidadDeContraseñaUE = ValidarCantidadDeContraseñaUE;
    }

    public JTextField getVisualizarContraseñaUE() {
        return VisualizarContraseñaUE;
    }

    public void setVisualizarContraseñaUE(JTextField VisualizarContraseñaUE) {
        this.VisualizarContraseñaUE = VisualizarContraseñaUE;
    }

    public JLabel getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(JLabel correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenerosGroupUE = new javax.swing.ButtonGroup();
        PestañasUsuario = new javax.swing.JTabbedPane();
        PerfilPanelUsuario = new javax.swing.JPanel();
        buttonSig3 = new javax.swing.JButton();
        buttonSig2 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        Gestionar4 = new javax.swing.JButton();
        Gestionar3 = new javax.swing.JButton();
        Gestionar2 = new javax.swing.JButton();
        Gestionar1 = new javax.swing.JButton();
        EditBtn = new javax.swing.JLabel();
        EditBtn2 = new javax.swing.JLabel();
        Informacion4 = new javax.swing.JLabel();
        Informacion3 = new javax.swing.JLabel();
        Informacion2 = new javax.swing.JLabel();
        Informacion1 = new javax.swing.JLabel();
        Informacion = new javax.swing.JLabel();
        Cositos = new javax.swing.JLabel();
        Separador4 = new javax.swing.JSeparator();
        Separador3 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        SloganUsuario = new javax.swing.JTextField();
        correoUsuario = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JLabel();
        FotoUsuario = new javax.swing.JLabel();
        PortadaUsuario = new javax.swing.JLabel();
        UsuarioBanner = new javax.swing.JLabel();
        DesPer = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Posteados = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Postear = new javax.swing.JTextArea();
        FondoPosteo = new javax.swing.JLabel();
        PostearPost = new javax.swing.JButton();
        EliminarPost = new javax.swing.JButton();
        EditarPost = new javax.swing.JButton();
        Post = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PanelChat = new javax.swing.JPanel();
        iconChats = new javax.swing.JLabel();
        chatEnviar = new javax.swing.JButton();
        ChatTitulo = new javax.swing.JLabel();
        chatMensaje = new javax.swing.JTextField();
        chatEmoji = new javax.swing.JLabel();
        PestanasChat = new javax.swing.JTabbedPane();
        PanelAmigos = new javax.swing.JPanel();
        PanelMensajes = new javax.swing.JPanel();
        EditarPanelUsuario = new javax.swing.JPanel();
        Regresar = new javax.swing.JButton();
        SloganEditado = new javax.swing.JButton();
        ContraseñaEditado = new javax.swing.JButton();
        CorreoEditado = new javax.swing.JButton();
        FechaEditado = new javax.swing.JButton();
        GeneroEditado = new javax.swing.JButton();
        ApdoEditado = new javax.swing.JButton();
        NomEditador = new javax.swing.JButton();
        NomUE = new javax.swing.JLabel();
        NombreUE = new javax.swing.JTextField();
        ApellidoUE = new javax.swing.JLabel();
        ApdoUE = new javax.swing.JTextField();
        GeneroUE = new javax.swing.JLabel();
        HombreUE = new javax.swing.JRadioButton();
        MujerUE = new javax.swing.JRadioButton();
        EdadUE = new javax.swing.JLabel();
        FDiaUE = new javax.swing.JLabel();
        DiaUE = new javax.swing.JComboBox<>();
        FMesUE = new javax.swing.JLabel();
        MesUE = new javax.swing.JComboBox<>();
        FAñoUE = new javax.swing.JLabel();
        AñoUE = new javax.swing.JComboBox<>();
        CorreoUE = new javax.swing.JLabel();
        SgUE = new javax.swing.JTextField();
        ArrobaUE = new javax.swing.JTextField();
        TipoCorreoUE = new javax.swing.JComboBox<>();
        ExtencionUE = new javax.swing.JComboBox<>();
        ContraseñaOcultaUE = new javax.swing.JPasswordField();
        ContraseñaVisibleEU = new javax.swing.JTextField();
        ValidarCantidadDeContraseñaUE = new javax.swing.JLabel();
        SloganUE = new javax.swing.JLabel();
        AñoSpinnerUE = new javax.swing.JSpinner();
        IngresarAñoUE = new javax.swing.JButton();
        SeleccionarAñoUE = new javax.swing.JButton();
        UsuarioBannerEditar = new javax.swing.JLabel();
        SeguridadUE1 = new javax.swing.JLabel();
        CorreoElectronicoUE = new javax.swing.JTextField();
        VisualizarContraseñaUE = new javax.swing.JTextField();
        AñadirPanelUsuario = new javax.swing.JPanel();
        DesAñadir = new javax.swing.JButton();
        TelAñadir = new javax.swing.JButton();
        TelefonoUA = new javax.swing.JTextField();
        TelUA = new javax.swing.JLabel();
        UsuarioBannerAñadir = new javax.swing.JLabel();
        Regresar2 = new javax.swing.JButton();
        DirAñadir = new javax.swing.JButton();
        DireccionUA = new javax.swing.JTextField();
        DirUA = new javax.swing.JLabel();
        DirUA1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescripcionAU = new javax.swing.JTextArea();
        ImportarPanelUsuario = new javax.swing.JPanel();
        UsuarioBannerImportar = new javax.swing.JLabel();
        FotoUsuario2 = new javax.swing.JLabel();
        PortadaUsuario2 = new javax.swing.JLabel();
        BtnCargarFotoPerfilU = new javax.swing.JButton();
        CargarFotoDePerfilU = new javax.swing.JLabel();
        CargarFotoDePerfilTextU = new javax.swing.JLabel();
        BtnCargarFotoPortadaU = new javax.swing.JButton();
        CargarFotoDePortadaU = new javax.swing.JLabel();
        CargarFotoDePortadaTextU = new javax.swing.JLabel();
        Regresar3 = new javax.swing.JButton();
        Eliminar = new javax.swing.JPanel();
        UsuarioBannerEliminar = new javax.swing.JLabel();
        FotoUsuario3 = new javax.swing.JLabel();
        PortadaUsuario3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PortadaEliminar = new javax.swing.JButton();
        FotoEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Regresar4 = new javax.swing.JButton();
        SloText = new javax.swing.JLabel();
        DesText = new javax.swing.JLabel();
        DirText = new javax.swing.JLabel();
        TelText = new javax.swing.JLabel();
        DescripcionEliminar = new javax.swing.JButton();
        TelefonoEliminar = new javax.swing.JButton();
        DireccionEliminar = new javax.swing.JButton();
        SloganEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        MenuBarUsuario = new javax.swing.JMenuBar();
        UsuarioMenuUsuario = new javax.swing.JMenu();
        CerrarSesionU = new javax.swing.JMenuItem();
        CerrarProgramaU = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        PestañasUsuario.setBackground(new java.awt.Color(51, 153, 255));
        PestañasUsuario.setForeground(new java.awt.Color(255, 255, 255));
        PestañasUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PerfilPanelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PerfilPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonSig3.setBackground(new java.awt.Color(51, 153, 255));
        buttonSig3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonSig3.setForeground(new java.awt.Color(255, 255, 255));
        buttonSig3.setText("Button");
        buttonSig3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonSig3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSig3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSig3ActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(buttonSig3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 110, 40));

        buttonSig2.setBackground(new java.awt.Color(51, 153, 255));
        buttonSig2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonSig2.setForeground(new java.awt.Color(255, 255, 255));
        buttonSig2.setText("Button");
        buttonSig2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonSig2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSig2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSig2ActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(buttonSig2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 110, 40));

        button4.setBackground(new java.awt.Color(51, 153, 255));
        button4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Button");
        button4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 110, 40));

        Gestionar4.setBackground(new java.awt.Color(51, 153, 255));
        Gestionar4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gestionar4.setForeground(new java.awt.Color(255, 255, 255));
        Gestionar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/trash_recycle.png"))); // NOI18N
        Gestionar4.setText("Eliminar");
        Gestionar4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Gestionar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gestionar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gestionar4ActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(Gestionar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 110, 40));

        Gestionar3.setBackground(new java.awt.Color(51, 153, 255));
        Gestionar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gestionar3.setForeground(new java.awt.Color(255, 255, 255));
        Gestionar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/folder_open_add.png"))); // NOI18N
        Gestionar3.setText("Importar");
        Gestionar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Gestionar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gestionar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gestionar3ActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(Gestionar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 110, 40));

        Gestionar2.setBackground(new java.awt.Color(51, 153, 255));
        Gestionar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gestionar2.setForeground(new java.awt.Color(255, 255, 255));
        Gestionar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add_plus.png"))); // NOI18N
        Gestionar2.setText("Añadir");
        Gestionar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Gestionar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gestionar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gestionar2ActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(Gestionar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, 40));

        Gestionar1.setBackground(new java.awt.Color(51, 153, 255));
        Gestionar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gestionar1.setForeground(new java.awt.Color(255, 255, 255));
        Gestionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit.png"))); // NOI18N
        Gestionar1.setText("Editar");
        Gestionar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Gestionar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gestionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gestionar1ActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(Gestionar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 100, 40));

        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit.png"))); // NOI18N
        EditBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        PerfilPanelUsuario.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 20, 20));

        EditBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit.png"))); // NOI18N
        EditBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtn2MouseClicked(evt);
            }
        });
        PerfilPanelUsuario.add(EditBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 20, 20));

        Informacion4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Informacion4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Informacion4.setText("Dirección");
        PerfilPanelUsuario.add(Informacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 424, 120, 20));

        Informacion3.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Informacion3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Informacion3.setText("Telefono");
        PerfilPanelUsuario.add(Informacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 10));

        Informacion2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Informacion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Informacion2.setText("Correo");
        PerfilPanelUsuario.add(Informacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, -1));

        Informacion1.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Informacion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Informacion1.setText("Edad");
        PerfilPanelUsuario.add(Informacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 120, 20));

        Informacion.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Informacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Informacion.setText("Genero");
        PerfilPanelUsuario.add(Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, 20));

        Cositos.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        Cositos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cositos.setText("<html>°<br><br>°<br><br>°<br><br>°<br><br>°</html>");
        PerfilPanelUsuario.add(Cositos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 10, 140));
        PerfilPanelUsuario.add(Separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 130, 20));

        Separador3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        PerfilPanelUsuario.add(Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 10, 330));

        Separador2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        PerfilPanelUsuario.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 10, 330));

        SloganUsuario.setEditable(false);
        SloganUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        SloganUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PerfilPanelUsuario.add(SloganUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 470, -1));

        correoUsuario.setBackground(new java.awt.Color(102, 102, 102));
        correoUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        correoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        correoUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        correoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        correoUsuario.setOpaque(true);
        PerfilPanelUsuario.add(correoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 270, 20));

        NombreUsuario.setBackground(new java.awt.Color(0, 0, 0));
        NombreUsuario.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        NombreUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        NombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NombreUsuario.setOpaque(true);
        PerfilPanelUsuario.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 330, 20));

        FotoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/TradicionalUser-BigIcon.png"))); // NOI18N
        FotoUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        FotoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FotoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FotoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FotoUsuarioMouseExited(evt);
            }
        });
        PerfilPanelUsuario.add(FotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 110));

        PortadaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PortadaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST-Principal.jpg"))); // NOI18N
        PortadaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PortadaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PortadaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PortadaUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PortadaUsuarioMouseExited(evt);
            }
        });
        PerfilPanelUsuario.add(PortadaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 150));

        UsuarioBanner.setBackground(new java.awt.Color(255, 0, 0));
        UsuarioBanner.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        UsuarioBanner.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioBanner.setText("Usuario");
        UsuarioBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0)));
        UsuarioBanner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UsuarioBanner.setOpaque(true);
        PerfilPanelUsuario.add(UsuarioBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        DesPer.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        DesPer.setText("Descripcion Personal:");
        PerfilPanelUsuario.add(DesPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 140, 20));

        Info.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Info.setText("Informacion:");
        PerfilPanelUsuario.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, 20));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(240, 240, 240));
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setDoubleBuffered(true);
        jScrollPane1.setViewportView(jTextArea1);

        PerfilPanelUsuario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 130, 90));

        Posteados.setEditable(false);
        Posteados.setColumns(20);
        Posteados.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Posteados.setLineWrap(true);
        Posteados.setRows(5);
        jScrollPane3.setViewportView(Posteados);

        PerfilPanelUsuario.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 360, 140));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("POSTEA:");
        PerfilPanelUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        Postear.setEditable(false);
        Postear.setBackground(new java.awt.Color(240, 240, 240));
        Postear.setColumns(20);
        Postear.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Postear.setLineWrap(true);
        Postear.setRows(5);
        jScrollPane4.setViewportView(Postear);

        PerfilPanelUsuario.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 360, 70));

        FondoPosteo.setBackground(new java.awt.Color(255, 255, 255));
        FondoPosteo.setOpaque(true);
        PerfilPanelUsuario.add(FondoPosteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 380, 160));

        PostearPost.setBackground(new java.awt.Color(0, 204, 0));
        PostearPost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PostearPost.setForeground(new java.awt.Color(255, 255, 255));
        PostearPost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        PostearPost.setText("POSTEAR");
        PostearPost.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PostearPost.setBorderPainted(false);
        PostearPost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PostearPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostearPostActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(PostearPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 100, 30));

        EliminarPost.setBackground(new java.awt.Color(51, 153, 255));
        EliminarPost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EliminarPost.setForeground(new java.awt.Color(255, 255, 255));
        EliminarPost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Clear.png"))); // NOI18N
        EliminarPost.setText("Eliminar");
        EliminarPost.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EliminarPost.setBorderPainted(false);
        EliminarPost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPostActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(EliminarPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 90, 30));

        EditarPost.setBackground(new java.awt.Color(51, 153, 255));
        EditarPost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EditarPost.setForeground(new java.awt.Color(255, 255, 255));
        EditarPost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit_add.png"))); // NOI18N
        EditarPost.setText("Editar");
        EditarPost.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditarPost.setBorderPainted(false);
        EditarPost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPostActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(EditarPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 80, 30));

        Post.setBackground(new java.awt.Color(51, 153, 255));
        Post.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Post.setForeground(new java.awt.Color(255, 255, 255));
        Post.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/form.png"))); // NOI18N
        Post.setText("Redactar");
        Post.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Post.setBorderPainted(false);
        Post.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostActionPerformed(evt);
            }
        });
        PerfilPanelUsuario.add(Post, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 90, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        PerfilPanelUsuario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 380, 120));

        PanelChat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconChats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconChats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/group_chatSmall.png"))); // NOI18N
        PanelChat.add(iconChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 4, 20, 20));

        chatEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/send.png"))); // NOI18N
        chatEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelChat.add(chatEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 40, 30));

        ChatTitulo.setBackground(new java.awt.Color(255, 0, 0));
        ChatTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChatTitulo.setForeground(new java.awt.Color(255, 255, 255));
        ChatTitulo.setText("   Chat");
        ChatTitulo.setOpaque(true);
        PanelChat.add(ChatTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));
        PanelChat.add(chatMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 290, 110, 30));

        chatEmoji.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chatEmoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/emoji.png"))); // NOI18N
        chatEmoji.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelChat.add(chatEmoji, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 30, 30));

        PestanasChat.setBackground(new java.awt.Color(51, 153, 255));
        PestanasChat.setForeground(new java.awt.Color(255, 255, 255));
        PestanasChat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelAmigosLayout = new javax.swing.GroupLayout(PanelAmigos);
        PanelAmigos.setLayout(PanelAmigosLayout);
        PanelAmigosLayout.setHorizontalGroup(
            PanelAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        PanelAmigosLayout.setVerticalGroup(
            PanelAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        PestanasChat.addTab("Amigos", PanelAmigos);

        javax.swing.GroupLayout PanelMensajesLayout = new javax.swing.GroupLayout(PanelMensajes);
        PanelMensajes.setLayout(PanelMensajesLayout);
        PanelMensajesLayout.setHorizontalGroup(
            PanelMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        PanelMensajesLayout.setVerticalGroup(
            PanelMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        PestanasChat.addTab("Mensajes", PanelMensajes);

        PanelChat.add(PestanasChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, 250));

        PerfilPanelUsuario.add(PanelChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 190, 330));

        PestañasUsuario.addTab("Perfil", PerfilPanelUsuario);

        EditarPanelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditarPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setBackground(new java.awt.Color(0, 204, 204));
        Regresar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("<<  Volver");
        Regresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153)));
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 110, -1));

        SloganEditado.setBackground(new java.awt.Color(51, 51, 255));
        SloganEditado.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        SloganEditado.setForeground(new java.awt.Color(255, 255, 255));
        SloganEditado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit_add.png"))); // NOI18N
        SloganEditado.setText("Editar");
        SloganEditado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        SloganEditado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SloganEditado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        SloganEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SloganEditadoActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(SloganEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 90, 20));

        ContraseñaEditado.setBackground(new java.awt.Color(51, 51, 255));
        ContraseñaEditado.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        ContraseñaEditado.setForeground(new java.awt.Color(255, 255, 255));
        ContraseñaEditado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit_add.png"))); // NOI18N
        ContraseñaEditado.setText("Editar");
        ContraseñaEditado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        ContraseñaEditado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContraseñaEditado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ContraseñaEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaEditadoActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(ContraseñaEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 90, 20));

        CorreoEditado.setBackground(new java.awt.Color(51, 51, 255));
        CorreoEditado.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        CorreoEditado.setForeground(new java.awt.Color(255, 255, 255));
        CorreoEditado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit_add.png"))); // NOI18N
        CorreoEditado.setText("Editar");
        CorreoEditado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        CorreoEditado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CorreoEditado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        CorreoEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoEditadoActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(CorreoEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 90, 20));

        FechaEditado.setBackground(new java.awt.Color(51, 51, 255));
        FechaEditado.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        FechaEditado.setForeground(new java.awt.Color(255, 255, 255));
        FechaEditado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit_add.png"))); // NOI18N
        FechaEditado.setText("Editar");
        FechaEditado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        FechaEditado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FechaEditado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        FechaEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaEditadoActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(FechaEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 90, 20));

        GeneroEditado.setBackground(new java.awt.Color(51, 51, 255));
        GeneroEditado.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        GeneroEditado.setForeground(new java.awt.Color(255, 255, 255));
        GeneroEditado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit_add.png"))); // NOI18N
        GeneroEditado.setText("Editar");
        GeneroEditado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        GeneroEditado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeneroEditado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        GeneroEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroEditadoActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(GeneroEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 90, 20));

        ApdoEditado.setBackground(new java.awt.Color(51, 51, 255));
        ApdoEditado.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        ApdoEditado.setForeground(new java.awt.Color(255, 255, 255));
        ApdoEditado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit_add.png"))); // NOI18N
        ApdoEditado.setText("Editar");
        ApdoEditado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        ApdoEditado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ApdoEditado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ApdoEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApdoEditadoActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(ApdoEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 90, 20));

        NomEditador.setBackground(new java.awt.Color(51, 51, 255));
        NomEditador.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        NomEditador.setForeground(new java.awt.Color(255, 255, 255));
        NomEditador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit_add.png"))); // NOI18N
        NomEditador.setText("Editar");
        NomEditador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        NomEditador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NomEditador.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        NomEditador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomEditadorActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(NomEditador, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 90, 20));

        NomUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NomUE.setText("Nombre/s:");
        EditarPanelUsuario.add(NomUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        NombreUE.setText("Escribir...");
        NombreUE.setAutoscrolls(false);
        NombreUE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NombreUE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NombreUEFocusGained(evt);
            }
        });
        NombreUE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreUEMouseClicked(evt);
            }
        });
        NombreUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUEActionPerformed(evt);
            }
        });
        NombreUE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreUEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreUEKeyTyped(evt);
            }
        });
        EditarPanelUsuario.add(NombreUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 200, -1));

        ApellidoUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ApellidoUE.setText("Apellido/s:");
        EditarPanelUsuario.add(ApellidoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        ApdoUE.setText("Escribir...");
        ApdoUE.setAutoscrolls(false);
        ApdoUE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ApdoUEFocusGained(evt);
            }
        });
        ApdoUE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApdoUEMouseClicked(evt);
            }
        });
        ApdoUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApdoUEActionPerformed(evt);
            }
        });
        ApdoUE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ApdoUEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApdoUEKeyTyped(evt);
            }
        });
        EditarPanelUsuario.add(ApdoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 200, -1));

        GeneroUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        GeneroUE.setText("Genero:");
        EditarPanelUsuario.add(GeneroUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        GenerosGroupUE.add(HombreUE);
        HombreUE.setSelected(true);
        HombreUE.setText("Hombre");
        EditarPanelUsuario.add(HombreUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        GenerosGroupUE.add(MujerUE);
        MujerUE.setText("Mujer");
        EditarPanelUsuario.add(MujerUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        EdadUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EdadUE.setText("Fecha de Nacimiento:");
        EditarPanelUsuario.add(EdadUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 20));

        FDiaUE.setText("Dia:");
        EditarPanelUsuario.add(FDiaUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 20));

        DiaUE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        DiaUE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DiaUE.setOpaque(false);
        DiaUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaUEActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(DiaUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 50, 20));

        FMesUE.setText("Mes:");
        EditarPanelUsuario.add(FMesUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, 20));

        MesUE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        MesUE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MesUE.setOpaque(false);
        MesUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesUEActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(MesUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 110, 20));

        FAñoUE.setText("Año:");
        EditarPanelUsuario.add(FAñoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, 20));

        AñoUE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "Digitar" }));
        AñoUE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AñoUE.setOpaque(false);
        AñoUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoUEActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(AñoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 70, 20));

        CorreoUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CorreoUE.setText("Correo Electronico:");
        EditarPanelUsuario.add(CorreoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 20));

        SgUE.setText("Escribir...");
        SgUE.setAutoscrolls(false);
        SgUE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SgUE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SgUEMouseClicked(evt);
            }
        });
        SgUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SgUEActionPerformed(evt);
            }
        });
        SgUE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SgUEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SgUEKeyTyped(evt);
            }
        });
        EditarPanelUsuario.add(SgUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 160, 20));

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
        EditarPanelUsuario.add(ArrobaUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 20, 20));

        TipoCorreoUE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hotmail", "gmail", "mail.edu" }));
        TipoCorreoUE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditarPanelUsuario.add(TipoCorreoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 80, 20));

        ExtencionUE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".com", ".co", ".org", ".es", ".es.tl" }));
        ExtencionUE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditarPanelUsuario.add(ExtencionUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 60, 20));

        ContraseñaOcultaUE.setText("Escribir...");
        ContraseñaOcultaUE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContraseñaOcultaUEFocusGained(evt);
            }
        });
        ContraseñaOcultaUE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaOcultaUEMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContraseñaOcultaUEMouseExited(evt);
            }
        });
        ContraseñaOcultaUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaOcultaUEActionPerformed(evt);
            }
        });
        ContraseñaOcultaUE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñaOcultaUEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseñaOcultaUEKeyTyped(evt);
            }
        });
        EditarPanelUsuario.add(ContraseñaOcultaUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 200, -1));

        ContraseñaVisibleEU.setText("Escribir...");
        ContraseñaVisibleEU.setAutoscrolls(false);
        ContraseñaVisibleEU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaVisibleEUMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContraseñaVisibleEUMouseExited(evt);
            }
        });
        ContraseñaVisibleEU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaVisibleEUActionPerformed(evt);
            }
        });
        ContraseñaVisibleEU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñaVisibleEUKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseñaVisibleEUKeyTyped(evt);
            }
        });
        EditarPanelUsuario.add(ContraseñaVisibleEU, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 200, -1));

        ValidarCantidadDeContraseñaUE.setForeground(new java.awt.Color(255, 0, 0));
        EditarPanelUsuario.add(ValidarCantidadDeContraseñaUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 200, 20));

        SloganUE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SloganUE.setText("Slogan:");
        EditarPanelUsuario.add(SloganUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, 20));

        AñoSpinnerUE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AñoSpinnerUE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AñoSpinnerUEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñoSpinnerUEKeyTyped(evt);
            }
        });
        EditarPanelUsuario.add(AñoSpinnerUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 60, 20));

        IngresarAñoUE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        IngresarAñoUE.setText("Guardar");
        IngresarAñoUE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresarAñoUE.setOpaque(false);
        IngresarAñoUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarAñoUEActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(IngresarAñoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 100, 20));

        SeleccionarAñoUE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CerrarVentana.png"))); // NOI18N
        SeleccionarAñoUE.setText("Cancelar");
        SeleccionarAñoUE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleccionarAñoUE.setOpaque(false);
        SeleccionarAñoUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarAñoUEActionPerformed(evt);
            }
        });
        EditarPanelUsuario.add(SeleccionarAñoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, 20));

        UsuarioBannerEditar.setBackground(new java.awt.Color(255, 0, 0));
        UsuarioBannerEditar.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        UsuarioBannerEditar.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioBannerEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioBannerEditar.setText("Editar");
        UsuarioBannerEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0)));
        UsuarioBannerEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UsuarioBannerEditar.setOpaque(true);
        EditarPanelUsuario.add(UsuarioBannerEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        SeguridadUE1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SeguridadUE1.setText("Contraseña:");
        EditarPanelUsuario.add(SeguridadUE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, 20));

        CorreoElectronicoUE.setText("Escribir...");
        CorreoElectronicoUE.setAutoscrolls(false);
        CorreoElectronicoUE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CorreoElectronicoUE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CorreoElectronicoUEFocusGained(evt);
            }
        });
        CorreoElectronicoUE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorreoElectronicoUEMouseClicked(evt);
            }
        });
        CorreoElectronicoUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoElectronicoUEActionPerformed(evt);
            }
        });
        CorreoElectronicoUE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CorreoElectronicoUEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoElectronicoUEKeyTyped(evt);
            }
        });
        EditarPanelUsuario.add(CorreoElectronicoUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 160, 20));

        VisualizarContraseñaUE.setEditable(false);
        VisualizarContraseñaUE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditarPanelUsuario.add(VisualizarContraseñaUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 170, -1));

        PestañasUsuario.addTab("Editar", EditarPanelUsuario);

        AñadirPanelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AñadirPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DesAñadir.setBackground(new java.awt.Color(51, 51, 255));
        DesAñadir.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        DesAñadir.setForeground(new java.awt.Color(255, 255, 255));
        DesAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_add.png"))); // NOI18N
        DesAñadir.setText("Añadir");
        DesAñadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        DesAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DesAñadir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DesAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesAñadirActionPerformed(evt);
            }
        });
        AñadirPanelUsuario.add(DesAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, 20));

        TelAñadir.setBackground(new java.awt.Color(51, 51, 255));
        TelAñadir.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        TelAñadir.setForeground(new java.awt.Color(255, 255, 255));
        TelAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_add.png"))); // NOI18N
        TelAñadir.setText("Añadir");
        TelAñadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        TelAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TelAñadir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        TelAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelAñadirActionPerformed(evt);
            }
        });
        AñadirPanelUsuario.add(TelAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 90, 20));

        TelefonoUA.setText("Escribir...");
        TelefonoUA.setAutoscrolls(false);
        TelefonoUA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TelefonoUA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TelefonoUAFocusGained(evt);
            }
        });
        TelefonoUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelefonoUAMouseClicked(evt);
            }
        });
        TelefonoUA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TelefonoUAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoUAKeyTyped(evt);
            }
        });
        AñadirPanelUsuario.add(TelefonoUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, -1));

        TelUA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TelUA.setText("Telefono:");
        AñadirPanelUsuario.add(TelUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 20));

        UsuarioBannerAñadir.setBackground(new java.awt.Color(255, 0, 0));
        UsuarioBannerAñadir.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        UsuarioBannerAñadir.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioBannerAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioBannerAñadir.setText("Añadir");
        UsuarioBannerAñadir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0)));
        UsuarioBannerAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UsuarioBannerAñadir.setOpaque(true);
        AñadirPanelUsuario.add(UsuarioBannerAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        Regresar2.setBackground(new java.awt.Color(0, 204, 204));
        Regresar2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Regresar2.setForeground(new java.awt.Color(255, 255, 255));
        Regresar2.setText("<<  Volver");
        Regresar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153)));
        Regresar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar2ActionPerformed(evt);
            }
        });
        AñadirPanelUsuario.add(Regresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 110, -1));

        DirAñadir.setBackground(new java.awt.Color(51, 51, 255));
        DirAñadir.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        DirAñadir.setForeground(new java.awt.Color(255, 255, 255));
        DirAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_add.png"))); // NOI18N
        DirAñadir.setText("Añadir");
        DirAñadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        DirAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DirAñadir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DirAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirAñadirActionPerformed(evt);
            }
        });
        AñadirPanelUsuario.add(DirAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 90, 20));

        DireccionUA.setText("Escribir...");
        DireccionUA.setAutoscrolls(false);
        DireccionUA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DireccionUA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DireccionUAFocusGained(evt);
            }
        });
        DireccionUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DireccionUAMouseClicked(evt);
            }
        });
        DireccionUA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DireccionUAKeyPressed(evt);
            }
        });
        AñadirPanelUsuario.add(DireccionUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 200, -1));

        DirUA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DirUA.setText("Descripción Personal:");
        AñadirPanelUsuario.add(DirUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, 20));

        DirUA1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DirUA1.setText("Dirección:");
        AñadirPanelUsuario.add(DirUA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 60, 20));

        DescripcionAU.setColumns(20);
        DescripcionAU.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DescripcionAU.setLineWrap(true);
        DescripcionAU.setRows(5);
        DescripcionAU.setText("Escribir...");
        DescripcionAU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DescripcionAUFocusGained(evt);
            }
        });
        DescripcionAU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DescripcionAUMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DescripcionAU);

        AñadirPanelUsuario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 500, 140));

        PestañasUsuario.addTab("Añadir", AñadirPanelUsuario);

        ImportarPanelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ImportarPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuarioBannerImportar.setBackground(new java.awt.Color(255, 0, 0));
        UsuarioBannerImportar.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        UsuarioBannerImportar.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioBannerImportar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioBannerImportar.setText("Importar");
        UsuarioBannerImportar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0)));
        UsuarioBannerImportar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UsuarioBannerImportar.setOpaque(true);
        ImportarPanelUsuario.add(UsuarioBannerImportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        FotoUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FotoUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/TradicionalUser-BigIcon.png"))); // NOI18N
        FotoUsuario2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ImportarPanelUsuario.add(FotoUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 100));

        PortadaUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PortadaUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST-Principal.jpg"))); // NOI18N
        PortadaUsuario2.setToolTipText("");
        PortadaUsuario2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ImportarPanelUsuario.add(PortadaUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 690, 140));

        BtnCargarFotoPerfilU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/folder_open_add.png"))); // NOI18N
        BtnCargarFotoPerfilU.setText("Cargar... ");
        BtnCargarFotoPerfilU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCargarFotoPerfilU.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnCargarFotoPerfilU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarFotoPerfilUActionPerformed(evt);
            }
        });
        ImportarPanelUsuario.add(BtnCargarFotoPerfilU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 130, -1));

        CargarFotoDePerfilU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarFotoDePerfilU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/camera.png"))); // NOI18N
        CargarFotoDePerfilU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CargarFotoDePerfilU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarFotoDePerfilU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarFotoDePerfilUMouseClicked(evt);
            }
        });
        ImportarPanelUsuario.add(CargarFotoDePerfilU, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 90, 80));

        CargarFotoDePerfilTextU.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        CargarFotoDePerfilTextU.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CargarFotoDePerfilTextU.setText("<html>Cargar foto de Perfil &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br /><br /><br /></html>");
        CargarFotoDePerfilTextU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CargarFotoDePerfilTextU.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargarFotoDePerfilTextU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarFotoDePerfilTextUMouseClicked(evt);
            }
        });
        ImportarPanelUsuario.add(CargarFotoDePerfilTextU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 100));

        BtnCargarFotoPortadaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/folder_open_add.png"))); // NOI18N
        BtnCargarFotoPortadaU.setText("Cargar...");
        BtnCargarFotoPortadaU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCargarFotoPortadaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarFotoPortadaUActionPerformed(evt);
            }
        });
        ImportarPanelUsuario.add(BtnCargarFotoPortadaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 130, -1));

        CargarFotoDePortadaU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarFotoDePortadaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/camera.png"))); // NOI18N
        CargarFotoDePortadaU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CargarFotoDePortadaU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarFotoDePortadaU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarFotoDePortadaUMouseClicked(evt);
            }
        });
        ImportarPanelUsuario.add(CargarFotoDePortadaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 90, 80));

        CargarFotoDePortadaTextU.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        CargarFotoDePortadaTextU.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CargarFotoDePortadaTextU.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp; Cargar foto de Portada<br /><br /><br /></html>");
        CargarFotoDePortadaTextU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CargarFotoDePortadaTextU.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargarFotoDePortadaTextU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarFotoDePortadaTextUMouseClicked(evt);
            }
        });
        ImportarPanelUsuario.add(CargarFotoDePortadaTextU, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 280, 100));

        Regresar3.setBackground(new java.awt.Color(0, 204, 204));
        Regresar3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Regresar3.setForeground(new java.awt.Color(255, 255, 255));
        Regresar3.setText("<<  Volver");
        Regresar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153)));
        Regresar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar3ActionPerformed(evt);
            }
        });
        ImportarPanelUsuario.add(Regresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 110, -1));

        PestañasUsuario.addTab("Importar", ImportarPanelUsuario);

        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuarioBannerEliminar.setBackground(new java.awt.Color(255, 0, 0));
        UsuarioBannerEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        UsuarioBannerEliminar.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioBannerEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioBannerEliminar.setText("Eliminar");
        UsuarioBannerEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0)));
        UsuarioBannerEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UsuarioBannerEliminar.setOpaque(true);
        Eliminar.add(UsuarioBannerEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        FotoUsuario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FotoUsuario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/TradicionalUser-BigIcon.png"))); // NOI18N
        FotoUsuario3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        FotoUsuario3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FotoUsuario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FotoUsuario3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FotoUsuario3MouseExited(evt);
            }
        });
        Eliminar.add(FotoUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 120, 110));

        PortadaUsuario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PortadaUsuario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST-Principal.jpg"))); // NOI18N
        PortadaUsuario3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PortadaUsuario3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PortadaUsuario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PortadaUsuario3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PortadaUsuario3MouseExited(evt);
            }
        });
        Eliminar.add(PortadaUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 380, 160));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Foto de Portada");
        Eliminar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        PortadaEliminar.setBackground(new java.awt.Color(51, 51, 255));
        PortadaEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        PortadaEliminar.setForeground(new java.awt.Color(255, 255, 255));
        PortadaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/trash_recycle.png"))); // NOI18N
        PortadaEliminar.setText("Eliminar");
        PortadaEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        PortadaEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PortadaEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PortadaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortadaEliminarActionPerformed(evt);
            }
        });
        Eliminar.add(PortadaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 100, 30));

        FotoEliminar.setBackground(new java.awt.Color(51, 51, 255));
        FotoEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        FotoEliminar.setForeground(new java.awt.Color(255, 255, 255));
        FotoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/trash_recycle.png"))); // NOI18N
        FotoEliminar.setText("Eliminar");
        FotoEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        FotoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FotoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        FotoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FotoEliminarActionPerformed(evt);
            }
        });
        Eliminar.add(FotoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Foto de Perfil");
        Eliminar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        Regresar4.setBackground(new java.awt.Color(0, 204, 204));
        Regresar4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Regresar4.setForeground(new java.awt.Color(255, 255, 255));
        Regresar4.setText("<<  Volver");
        Regresar4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153)));
        Regresar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar4ActionPerformed(evt);
            }
        });
        Eliminar.add(Regresar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 110, -1));

        SloText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        SloText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/chat.png"))); // NOI18N
        SloText.setText(" Slogan");
        Eliminar.add(SloText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, 30));

        DesText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        DesText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/spechbubble.png"))); // NOI18N
        DesText.setText(" Descripción");
        Eliminar.add(DesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, 30));

        DirText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        DirText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/map_marker.png"))); // NOI18N
        DirText.setText(" Dirección");
        Eliminar.add(DirText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, 30));

        TelText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        TelText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/phone.png"))); // NOI18N
        TelText.setText(" Telefono");
        Eliminar.add(TelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, 30));

        DescripcionEliminar.setBackground(new java.awt.Color(51, 51, 255));
        DescripcionEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        DescripcionEliminar.setForeground(new java.awt.Color(255, 255, 255));
        DescripcionEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/trash_recycle.png"))); // NOI18N
        DescripcionEliminar.setText("Eliminar");
        DescripcionEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        DescripcionEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DescripcionEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DescripcionEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionEliminarActionPerformed(evt);
            }
        });
        Eliminar.add(DescripcionEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 100, 30));

        TelefonoEliminar.setBackground(new java.awt.Color(51, 51, 255));
        TelefonoEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        TelefonoEliminar.setForeground(new java.awt.Color(255, 255, 255));
        TelefonoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/trash_recycle.png"))); // NOI18N
        TelefonoEliminar.setText("Eliminar");
        TelefonoEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        TelefonoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TelefonoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        TelefonoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoEliminarActionPerformed(evt);
            }
        });
        Eliminar.add(TelefonoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 100, 30));

        DireccionEliminar.setBackground(new java.awt.Color(51, 51, 255));
        DireccionEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        DireccionEliminar.setForeground(new java.awt.Color(255, 255, 255));
        DireccionEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/trash_recycle.png"))); // NOI18N
        DireccionEliminar.setText("Eliminar");
        DireccionEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        DireccionEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DireccionEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DireccionEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionEliminarActionPerformed(evt);
            }
        });
        Eliminar.add(DireccionEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 100, 30));

        SloganEliminar.setBackground(new java.awt.Color(51, 51, 255));
        SloganEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        SloganEliminar.setForeground(new java.awt.Color(255, 255, 255));
        SloganEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/trash_recycle.png"))); // NOI18N
        SloganEliminar.setText("Eliminar");
        SloganEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        SloganEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SloganEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        SloganEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SloganEliminarActionPerformed(evt);
            }
        });
        Eliminar.add(SloganEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 100, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Eliminar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 20, 400));

        PestañasUsuario.addTab("Eliminar", Eliminar);

        MenuBarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        MenuBarUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        UsuarioMenuUsuario.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioMenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/TradicionalUser.png"))); // NOI18N
        UsuarioMenuUsuario.setText("Usuario");
        UsuarioMenuUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CerrarSesionU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        CerrarSesionU.setBackground(new java.awt.Color(102, 102, 102));
        CerrarSesionU.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesionU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit.png"))); // NOI18N
        CerrarSesionU.setText("Cerrar Sesion");
        CerrarSesionU.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CerrarSesionU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesionU.setOpaque(true);
        CerrarSesionU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionUActionPerformed(evt);
            }
        });
        UsuarioMenuUsuario.add(CerrarSesionU);

        CerrarProgramaU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, 0));
        CerrarProgramaU.setBackground(new java.awt.Color(102, 102, 102));
        CerrarProgramaU.setForeground(new java.awt.Color(255, 255, 255));
        CerrarProgramaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CerrarVentana.png"))); // NOI18N
        CerrarProgramaU.setText("Cerrar Programa");
        CerrarProgramaU.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CerrarProgramaU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarProgramaU.setOpaque(true);
        CerrarProgramaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarProgramaUActionPerformed(evt);
            }
        });
        UsuarioMenuUsuario.add(CerrarProgramaU);

        MenuBarUsuario.add(UsuarioMenuUsuario);

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Tools.png"))); // NOI18N
        jMenu1.setText("Herramientas");
        jMenu1.setBorderPainted(true);
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Clear.png"))); // NOI18N
        jMenuItem1.setText("Limpiar Formulario");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem1.setBorderPainted(true);
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.setOpaque(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MenuBarUsuario.add(jMenu1);

        setJMenuBar(MenuBarUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestañasUsuario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestañasUsuario)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarLabelsDelPerfil(){
        
        String[] misDatos=iniciar.getPrincipal().getNegocio().datosDelLogeado();
        NombreUsuario.setText(misDatos[0] +" "+misDatos[1]);
        correoUsuario.setText(misDatos[5]);
       
        iniciarSesion();
        Informacion.setText(misDatos[6]);
        Informacion1.setText(misDatos[7]);
        Informacion2.setText(misDatos[5]);
        Informacion3.setText(misDatos[8]==null ? "Telefono": misDatos[8]);
        Informacion4.setText(misDatos[9]==null ? "Direccion": misDatos[9]);
        jTextArea1.setText(misDatos[10]);
        SloganUsuario.setText(misDatos[4]==null ? "":misDatos[4]);
        Posteados.setText(misDatos[11]);
       
        
    }
    
     private void iniciarSesion(){        
        CargarArchivos aux= new CargarArchivos(this);        
        String[]datos= iniciar.getPrincipal().getNegocio().datosDelLogeado();
        aux.CargarFoto(datos[2]==null ? "src/Iconos/TradicionalUser-BigIcon.png":datos[2], FotoUsuario);
        aux.CargarFoto(datos[3]==null ? "src/Imagenes/FondoSocialPOST-Principal.jpg":datos[3], PortadaUsuario);
        
         
    }
    
    private void CerrarSesionUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionUActionPerformed

        dispose();

        iniciar.getPrincipal().setVisible(true);
        
        Contador = Contador - Contador;
        Contador2 = Contador2 - Contador2;
        
        String[] ArregloConvertido = iniciar.getPrincipal().getNegocio().datosDelLogeado();
        
        JOptionPane.showMessageDialog(null, "Hasta pronto "+ArregloConvertido[0], "ADIOS, VUELVE PRONTO", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_CerrarSesionUActionPerformed

    private void CerrarProgramaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarProgramaUActionPerformed
        
        String[] ArregloConvertido = iniciar.getPrincipal().getNegocio().datosDelLogeado();
        
        JOptionPane.showMessageDialog(null, "Gracias por tu visita "+ArregloConvertido[0]+" "+ArregloConvertido[1], "ADIOS", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }//GEN-LAST:event_CerrarProgramaUActionPerformed

    private void NombreUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreUEMouseClicked

        US.MouseClickNombre();

    }//GEN-LAST:event_NombreUEMouseClicked

    private void NombreUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUEActionPerformed

    private void NombreUEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreUEKeyPressed

        US.ValidarBtnEnterNombre(evt);
        
    }//GEN-LAST:event_NombreUEKeyPressed

    private void NombreUEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreUEKeyTyped

        US.ValidarSolamenteLetras(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            NomEditador.doClick();
            
        }


    }//GEN-LAST:event_NombreUEKeyTyped

    private void ApdoUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApdoUEMouseClicked

        US.MouseClickApdo();

    }//GEN-LAST:event_ApdoUEMouseClicked

    private void ApdoUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApdoUEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApdoUEActionPerformed

    private void ApdoUEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApdoUEKeyPressed

        US.ValidarBtnEnterApdo(evt);

    }//GEN-LAST:event_ApdoUEKeyPressed

    private void ApdoUEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApdoUEKeyTyped

        US.ValidarSolamenteLetras(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            ApdoEditado.doClick();
            
        }

    }//GEN-LAST:event_ApdoUEKeyTyped

    private void DiaUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaUEActionPerformed

        US.ValidarDiasDeFebrero();

    }//GEN-LAST:event_DiaUEActionPerformed

    private void MesUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesUEActionPerformed

        US.ValidarDiasDeFebrero();

    }//GEN-LAST:event_MesUEActionPerformed

    private void AñoUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoUEActionPerformed

        US.HabilitarYDeshabilitarAño();

    }//GEN-LAST:event_AñoUEActionPerformed

    private void SgUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SgUEMouseClicked

        US.MouseClickSlogan();

    }//GEN-LAST:event_SgUEMouseClicked

    private void SgUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SgUEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SgUEActionPerformed

    private void SgUEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SgUEKeyPressed

        US.ValidarBtnEnterCorreo(evt);

    }//GEN-LAST:event_SgUEKeyPressed

    private void SgUEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SgUEKeyTyped

        US.ValidarNumerosYLetras(evt);

        if(evt.getKeyCode() == evt.VK_ENTER){
            
            SloganEditado.doClick();
            
        }

    }//GEN-LAST:event_SgUEKeyTyped

    private void ArrobaUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArrobaUEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrobaUEMouseClicked

    private void ArrobaUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrobaUEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrobaUEActionPerformed

    private void ContraseñaOcultaUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaOcultaUEMouseClicked

        US.MouseClickContraseña();

    }//GEN-LAST:event_ContraseñaOcultaUEMouseClicked

    private void ContraseñaOcultaUEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaOcultaUEMouseExited

        US.VisualizarTuContraseñaClick(evt);
        
        US.ValidadCantidadDeContraseñaConMouseFuera(evt);

    }//GEN-LAST:event_ContraseñaOcultaUEMouseExited

    private void ContraseñaOcultaUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaOcultaUEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaOcultaUEActionPerformed

    private void ContraseñaOcultaUEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaOcultaUEKeyPressed

        US.ValidarBtnEnterContraseñaOculta(evt);
        
        US.VisualizarTuContraseña(evt);

    }//GEN-LAST:event_ContraseñaOcultaUEKeyPressed

    private void ContraseñaOcultaUEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaOcultaUEKeyTyped

        US.ValidadCantidadDeContraseñaConTeclado(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            CorreoEditado.doClick();
            
        }

    }//GEN-LAST:event_ContraseñaOcultaUEKeyTyped

    private void AñoSpinnerUEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoSpinnerUEKeyPressed

        US.BloquearPegadoAltYShitf(evt);

    }//GEN-LAST:event_AñoSpinnerUEKeyPressed

    private void AñoSpinnerUEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoSpinnerUEKeyTyped

        US.ValidarSolamenteNumeros(evt);

    }//GEN-LAST:event_AñoSpinnerUEKeyTyped

    private void IngresarAñoUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarAñoUEActionPerformed

        US.AñadirAño();

    }//GEN-LAST:event_IngresarAñoUEActionPerformed

    private void SeleccionarAñoUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarAñoUEActionPerformed

        AñoUE.setSelectedItem("2018");

    }//GEN-LAST:event_SeleccionarAñoUEActionPerformed

    private void ContraseñaVisibleEUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaVisibleEUMouseClicked

        US.MouseClickContraseña();

    }//GEN-LAST:event_ContraseñaVisibleEUMouseClicked

    private void ContraseñaVisibleEUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaVisibleEUMouseExited

        US.ValidadCantidadDeContraseñaConMouseFuera(evt);

    }//GEN-LAST:event_ContraseñaVisibleEUMouseExited

    private void ContraseñaVisibleEUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaVisibleEUActionPerformed

    }//GEN-LAST:event_ContraseñaVisibleEUActionPerformed

    private void ContraseñaVisibleEUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaVisibleEUKeyPressed

        US.ValidarBtnEnterContraseñaOculta(evt);

    }//GEN-LAST:event_ContraseñaVisibleEUKeyPressed

    private void ContraseñaVisibleEUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaVisibleEUKeyTyped

        US.ValidadCantidadDeContraseñaConTeclado(evt);

    }//GEN-LAST:event_ContraseñaVisibleEUKeyTyped

    private void NomEditadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomEditadorActionPerformed

        if(NombreUE.getText().equals("") || NombreUE.getText().equals("Escribir...")){
        
            JOptionPane.showMessageDialog(null, "No puedes actualizar tu informacion porque este campo esta vacio.", "DENEGADO...", JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            
            try {
                iniciar.getPrincipal().getNegocio().editarMiDato("nombre", NombreUE.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            llenarLabelsDelPerfil();

            JOptionPane.showMessageDialog(null, "Tu Nombre ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }//GEN-LAST:event_NomEditadorActionPerformed
    
    private String sacarSexo(){
        
        String aux="";
        
        if (this.HombreUE.isSelected()) {
            
            aux="Hombre";
        
        }else{
            
            aux="Mujer";
            
        }
        
        return aux;
        
    }
    
    private void ApdoEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApdoEditadoActionPerformed

        if(ApdoUE.getText().equals("") || ApdoUE.getText().equals("Escribir...")){
        
            JOptionPane.showMessageDialog(null, "No puedes actualizar tu informacion porque este campo esta vacio.", "DENEGADO...", JOptionPane.ERROR_MESSAGE);
            
        }else{
        
            try {
                iniciar.getPrincipal().getNegocio().editarMiDato("apellido", ApdoUE.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            llenarLabelsDelPerfil();

            JOptionPane.showMessageDialog(null, "Tu Apellido ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }//GEN-LAST:event_ApdoEditadoActionPerformed

    private void GeneroEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroEditadoActionPerformed
        
        try {
            iniciar.getPrincipal().getNegocio().editarMiDato("genero", sacarSexo());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        llenarLabelsDelPerfil();

        JOptionPane.showMessageDialog(null, "Tu Genero ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_GeneroEditadoActionPerformed

    private String ValidarLaFecha(){
    
        String Fecha = DiaUE.getSelectedItem().toString()+"/"+MesUE.getSelectedItem().toString()+"/"+AñoUE.getSelectedItem().toString();
        
        return Fecha;
    }
    
    private void FechaEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaEditadoActionPerformed
        
        
        try {
           iniciar.getPrincipal().getNegocio().editarMiDato("fecha", ValidarLaFecha());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        llenarLabelsDelPerfil();
        
        JOptionPane.showMessageDialog(null, "Tu Fecha de Nacimiento ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_FechaEditadoActionPerformed

    private String CorreosElectronicosCompletos(){
        
        String CC=CorreoElectronicoUE.getText()+"@"+TipoCorreoUE.getSelectedItem().toString()+ExtencionUE.getSelectedItem().toString();
    
        return CC;
    }
    
    private void CorreoEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoEditadoActionPerformed
        
        if(CorreoElectronicoUE.getText().equals("") || CorreoElectronicoUE.getText().equals("Escribir...")){
        
            JOptionPane.showMessageDialog(null, "No puedes dejar el correo como vacio", "ERROR CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
            
        }else{
        
            try {
                iniciar.getPrincipal().getNegocio().editarMiDato("correo", CorreosElectronicosCompletos());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            llenarLabelsDelPerfil();
            JOptionPane.showMessageDialog(null, "Tu Correo ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }//GEN-LAST:event_CorreoEditadoActionPerformed

    private String validarLaContraseña(char[] contra){
        
        String aux="";
        
        for (int i = 0; i < contra.length; i++) {
            
            aux+=contra[i];
            
        }
        
        return aux;
    }
    
    private void ContraseñaEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaEditadoActionPerformed

        if(validarLaContraseña(ContraseñaOcultaUE.getPassword()).equals("") || validarLaContraseña(ContraseñaOcultaUE.getPassword()).equals("Escribir...")){
        
            JOptionPane.showMessageDialog(null, "No puedes dejar la contraseña como vacia", "ERROR CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
            
        }else{
            try {
               iniciar.getPrincipal().getNegocio().editarMiDato("contraseña", validarLaContraseña(ContraseñaOcultaUE.getPassword()));
             
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            llenarLabelsDelPerfil();
            JOptionPane.showMessageDialog(null, "Tu Contraseña ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }//GEN-LAST:event_ContraseñaEditadoActionPerformed

    private void CorreoElectronicoUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoElectronicoUEMouseClicked
        
        US.MouseClickCorreo();
        
    }//GEN-LAST:event_CorreoElectronicoUEMouseClicked

    private void CorreoElectronicoUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoElectronicoUEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoElectronicoUEActionPerformed

    private void CorreoElectronicoUEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoElectronicoUEKeyPressed
        
        US.BloquearPegadoAltYShitf(evt);
        
    }//GEN-LAST:event_CorreoElectronicoUEKeyPressed

    private void CorreoElectronicoUEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoElectronicoUEKeyTyped
        
        US.ValidarNumerosYLetras(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            CorreoEditado.doClick();
            
        }
        
    }//GEN-LAST:event_CorreoElectronicoUEKeyTyped

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed

        PestañasUsuario.setSelectedIndex(0);

    }//GEN-LAST:event_RegresarActionPerformed

    private void SloganEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SloganEditadoActionPerformed

        if(SgUE.getText().equals("") || SgUE.getText().equals("Escribir...")){
        
            JOptionPane.showMessageDialog(null, "No puedes actualizar tu informacion porque este campo esta vacio.", "DENEGADO...", JOptionPane.ERROR_MESSAGE);
            
        }else{
        
            try {
                iniciar.getPrincipal().getNegocio().editarMiDato("slogan", SgUE.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            llenarLabelsDelPerfil();

            JOptionPane.showMessageDialog(null, "Tu Slogan ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }//GEN-LAST:event_SloganEditadoActionPerformed

    private void NombreUEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreUEFocusGained
        
        US.MouseClickNombre();
        
    }//GEN-LAST:event_NombreUEFocusGained

    private void ApdoUEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApdoUEFocusGained
        
        US.MouseClickApdo();
        
    }//GEN-LAST:event_ApdoUEFocusGained

    private void CorreoElectronicoUEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CorreoElectronicoUEFocusGained
        
        US.MouseClickCorreo();
        
    }//GEN-LAST:event_CorreoElectronicoUEFocusGained

    private void ContraseñaOcultaUEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaOcultaUEFocusGained
        
        US.MouseClickContraseña();
        
    }//GEN-LAST:event_ContraseñaOcultaUEFocusGained

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        US.LimpiarRegistro();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void FotoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FotoUsuarioMouseEntered
        
        US.BtnEdit1ClickDentro();
        
    }//GEN-LAST:event_FotoUsuarioMouseEntered

    private void FotoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FotoUsuarioMouseExited
        
        US.BtnEdit1ClickFuera();
        
    }//GEN-LAST:event_FotoUsuarioMouseExited

    private void PortadaUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PortadaUsuarioMouseEntered
        
        US.BtnEdit2ClickDentro();
        
    }//GEN-LAST:event_PortadaUsuarioMouseEntered

    private void PortadaUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PortadaUsuarioMouseExited
        
        US.BtnEdit2ClickFuera();
        
    }//GEN-LAST:event_PortadaUsuarioMouseExited

    private void TelAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelAñadirActionPerformed
        
        if(TelefonoUA.getText().equals("") || TelefonoUA.getText().equals("Escribir...")){
        
            JOptionPane.showMessageDialog(null, "No puedes añadir tu nueva informacion porque este campo esta vacio.", "DENEGADO...", JOptionPane.ERROR_MESSAGE);
            
        }else{
            try {
                iniciar.getPrincipal().getNegocio().editarMiDato("telefono", TelefonoUA.getText());
                 llenarLabelsDelPerfil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
         
        
        }
        
    }//GEN-LAST:event_TelAñadirActionPerformed

    private void TelefonoUAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoUAFocusGained
        
        US.MouseClickTelefono();
        
    }//GEN-LAST:event_TelefonoUAFocusGained

    private void TelefonoUAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoUAMouseClicked
        
        US.MouseClickTelefono();
        
    }//GEN-LAST:event_TelefonoUAMouseClicked

    private void TelefonoUAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoUAKeyPressed
        
        US.ValidarBtnEnterTelefono(evt);
        
    }//GEN-LAST:event_TelefonoUAKeyPressed

    private void TelefonoUAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoUAKeyTyped
        
        US.ValidarSolamenteNumeros(evt);
        
    }//GEN-LAST:event_TelefonoUAKeyTyped

    private void Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar2ActionPerformed
        
        PestañasUsuario.setSelectedIndex(0);
        
    }//GEN-LAST:event_Regresar2ActionPerformed

    private void DirAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirAñadirActionPerformed
        
        if(DireccionUA.getText().equals("") || DireccionUA.getText().equals("Escribir...")){
        
            JOptionPane.showMessageDialog(null, "No puedes añadir tu nueva informacion porque este campo esta vacio.", "DENEGADO...", JOptionPane.ERROR_MESSAGE);
            
        }else{
            try {
                iniciar.getPrincipal().getNegocio().editarMiDato("direccion", DireccionUA.getText());
                 llenarLabelsDelPerfil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
         
        }
        
    }//GEN-LAST:event_DirAñadirActionPerformed

    private void DireccionUAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DireccionUAFocusGained
        
        US.MouseClickDireccion();
        
    }//GEN-LAST:event_DireccionUAFocusGained

    private void DireccionUAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DireccionUAMouseClicked
        
        US.MouseClickDireccion();
        
    }//GEN-LAST:event_DireccionUAMouseClicked

    private void DireccionUAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DireccionUAKeyPressed
        
        US.ValidarBtnEnterDireccion(evt);
        
    }//GEN-LAST:event_DireccionUAKeyPressed

    private void DesAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesAñadirActionPerformed
        
        if(DescripcionAU.getText().equals("") || DescripcionAU.getText().equals("Escribir...")){
        
            JOptionPane.showMessageDialog(null, "No puedes añadir tu nueva informacion porque este campo esta vacio.", "DENEGADO...", JOptionPane.ERROR_MESSAGE);
            
        }else{
         try {
                iniciar.getPrincipal().getNegocio().editarMiDato("descripcion", DescripcionAU.getText());
                 llenarLabelsDelPerfil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
    }//GEN-LAST:event_DesAñadirActionPerformed

    private void CargarFotoDePerfilUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarFotoDePerfilUMouseClicked

        cargar.CargarFotoDePerfilParaSocial2();
        
        try {
                iniciar.getPrincipal().getNegocio().editarMiDato("perfil", cargar.getUrlPerfil());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            llenarLabelsDelPerfil();

            JOptionPane.showMessageDialog(null, "Tu Foto de Perfil ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_CargarFotoDePerfilUMouseClicked

    private void BtnCargarFotoPerfilUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarFotoPerfilUActionPerformed

        cargar.CargarFotoDePerfilParaSocial2();
        
        try {
                iniciar.getPrincipal().getNegocio().editarMiDato("perfil", cargar.getUrlPerfil());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            llenarLabelsDelPerfil();

            JOptionPane.showMessageDialog(null, "Tu Foto de Perfil ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_BtnCargarFotoPerfilUActionPerformed

    private void CargarFotoDePerfilTextUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarFotoDePerfilTextUMouseClicked

        cargar.CargarFotoDePerfilParaSocial2();
        
        try {
                iniciar.getPrincipal().getNegocio().editarMiDato("perfil", cargar.getUrlPerfil());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            llenarLabelsDelPerfil();

            JOptionPane.showMessageDialog(null, "Tu Foto de Perfil ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_CargarFotoDePerfilTextUMouseClicked

    private void CargarFotoDePortadaUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarFotoDePortadaUMouseClicked

        cargar.CargarFotoDePortadaParaSocial2();
        
        try {
                iniciar.getPrincipal().getNegocio().editarMiDato("portada", cargar.getUrlPerfil());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            llenarLabelsDelPerfil();

            JOptionPane.showMessageDialog(null, "Tu Foto de Portada ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_CargarFotoDePortadaUMouseClicked

    private void CargarFotoDePortadaTextUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarFotoDePortadaTextUMouseClicked

        cargar.CargarFotoDePortadaParaSocial2();
        
        try {
                iniciar.getPrincipal().getNegocio().editarMiDato("portada", cargar.getUrlPerfil());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            llenarLabelsDelPerfil();

            JOptionPane.showMessageDialog(null, "Tu Foto de Portada ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_CargarFotoDePortadaTextUMouseClicked

    private void BtnCargarFotoPortadaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarFotoPortadaUActionPerformed

        cargar.CargarFotoDePortadaParaSocial2();
        
        try {
                iniciar.getPrincipal().getNegocio().editarMiDato("portada", cargar.getUrlPerfil());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            llenarLabelsDelPerfil();

            JOptionPane.showMessageDialog(null, "Tu Foto de Portada ha sido editado de manera exitosa", "EDICION EXITOSA", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_BtnCargarFotoPortadaUActionPerformed

    private void Regresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar3ActionPerformed
        
        PestañasUsuario.setSelectedIndex(0);
        
    }//GEN-LAST:event_Regresar3ActionPerformed

    private void Regresar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar4ActionPerformed
        
        PestañasUsuario.setSelectedIndex(0);
        
    }//GEN-LAST:event_Regresar4ActionPerformed

    private void FotoUsuario3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FotoUsuario3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_FotoUsuario3MouseEntered

    private void FotoUsuario3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FotoUsuario3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_FotoUsuario3MouseExited

    private void PortadaUsuario3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PortadaUsuario3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PortadaUsuario3MouseEntered

    private void PortadaUsuario3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PortadaUsuario3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PortadaUsuario3MouseExited

    private void FotoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FotoEliminarActionPerformed
         try {
                iniciar.getPrincipal().getNegocio().editarMiDato("perfil", null);
                llenarLabelsDelPerfil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }//GEN-LAST:event_FotoEliminarActionPerformed

    private void PortadaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortadaEliminarActionPerformed
         try {
                iniciar.getPrincipal().getNegocio().editarMiDato("portada", null);
                llenarLabelsDelPerfil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }//GEN-LAST:event_PortadaEliminarActionPerformed

    private void TelefonoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoEliminarActionPerformed
        try {
                iniciar.getPrincipal().getNegocio().editarMiDato("telefono", null);
                llenarLabelsDelPerfil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        
    }//GEN-LAST:event_TelefonoEliminarActionPerformed

    private void DireccionEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionEliminarActionPerformed
         try {
                iniciar.getPrincipal().getNegocio().editarMiDato("direccion", null);
                llenarLabelsDelPerfil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
    }//GEN-LAST:event_DireccionEliminarActionPerformed

    private void DescripcionEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionEliminarActionPerformed
         try {
                iniciar.getPrincipal().getNegocio().editarMiDato("slogan",null);
                llenarLabelsDelPerfil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }//GEN-LAST:event_DescripcionEliminarActionPerformed

    private void SloganEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SloganEliminarActionPerformed
        try {
                iniciar.getPrincipal().getNegocio().editarMiDato("descripcion", null);
                 llenarLabelsDelPerfil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }//GEN-LAST:event_SloganEliminarActionPerformed

    private void DescripcionAUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescripcionAUMouseClicked
        
        US.MouseClickDescripcion();
        
    }//GEN-LAST:event_DescripcionAUMouseClicked

    private void DescripcionAUFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescripcionAUFocusGained
        
        US.MouseClickDescripcion();
        
    }//GEN-LAST:event_DescripcionAUFocusGained

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        PestañasUsuario.setSelectedIndex(3);
    }//GEN-LAST:event_EditBtnMouseClicked

    private void EditBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtn2MouseClicked
        
        PestañasUsuario.setSelectedIndex(3);
        
    }//GEN-LAST:event_EditBtn2MouseClicked

    private void EditarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPostActionPerformed
        
        Postear.setEditable(true);
        Postear.requestFocus();
                
    }//GEN-LAST:event_EditarPostActionPerformed

    private void PostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostActionPerformed
        
        Postear.setEditable(true);
        Postear.requestFocus();
        Postear.setText("");
        
    }//GEN-LAST:event_PostActionPerformed

    private void EliminarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPostActionPerformed
        
        Postear.setText("");
        
    }//GEN-LAST:event_EliminarPostActionPerformed

    private void PostearPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostearPostActionPerformed
        
        Posteados.setText(Posteados.getText()+"\n"+Postear.getText()+"\n\n");        
                
        try {
            iniciar.getPrincipal().getNegocio().editarMiDato("posteados", Posteados.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        llenarLabelsDelPerfil();

        JOptionPane.showMessageDialog(null, "Tu POSTEO ha sido publicado de manera exitosa", "POSTEO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_PostearPostActionPerformed

    private void Gestionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gestionar1ActionPerformed
        PestañasUsuario.setSelectedIndex(1);
        UsuarioBannerEditar.requestFocus();
    }//GEN-LAST:event_Gestionar1ActionPerformed

    private void Gestionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gestionar2ActionPerformed
        PestañasUsuario.setSelectedIndex(2);
        UsuarioBannerAñadir.requestFocus();
    }//GEN-LAST:event_Gestionar2ActionPerformed

    private void Gestionar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gestionar3ActionPerformed
        PestañasUsuario.setSelectedIndex(3);
        UsuarioBannerImportar.requestFocus();
    }//GEN-LAST:event_Gestionar3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        JOptionPane.showMessageDialog(null, "Esta opcion estara disponible solamente en futuras versiones de SocialPOST", "PROXIMAMENTE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_button4ActionPerformed

    private void Gestionar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gestionar4ActionPerformed
        PestañasUsuario.setSelectedIndex(4);
        UsuarioBannerImportar.requestFocus();
    }//GEN-LAST:event_Gestionar4ActionPerformed

    private void buttonSig2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSig2ActionPerformed
        JOptionPane.showMessageDialog(null, "Esta opcion estara disponible solamente en futuras versiones de SocialPOST", "PROXIMAMENTE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonSig2ActionPerformed

    private void buttonSig3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSig3ActionPerformed
        JOptionPane.showMessageDialog(null, "Esta opcion estara disponible solamente en futuras versiones de SocialPOST", "PROXIMAMENTE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonSig3ActionPerformed

    public void CerrarVentana(){

        try{
    
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                confirmarSalida();
                
            }
        });
        
        this.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void confirmarSalida(){

        JOptionPane.showMessageDialog(null, "Estas intentando cerrar la aplicacion sin cerrar sesión primero", "ADVENTENCIA", JOptionPane.WARNING_MESSAGE);
        int valor = JOptionPane.showConfirmDialog(this, "¿Deseas cerrar sesión y la aplicacion al mismo tiempo?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(valor==JOptionPane.YES_OPTION){
        
            String[] ArregloConvertido = iniciar.getPrincipal().getNegocio().datosDelLogeado();
            JOptionPane.showMessageDialog(null, "Gracias por tu visita "+ArregloConvertido[0]+" "+ArregloConvertido[1]+" vuelve pronto.", "ADIOS", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        
        }else if(valor == JOptionPane.YES_NO_CANCEL_OPTION){
    
        }

    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ApdoEditado;
    public static javax.swing.JTextField ApdoUE;
    private javax.swing.JLabel ApellidoUE;
    public static javax.swing.JTextField ArrobaUE;
    private javax.swing.JPanel AñadirPanelUsuario;
    public static javax.swing.JSpinner AñoSpinnerUE;
    public static javax.swing.JComboBox<String> AñoUE;
    private javax.swing.JButton BtnCargarFotoPerfilU;
    private javax.swing.JButton BtnCargarFotoPortadaU;
    private javax.swing.JLabel CargarFotoDePerfilTextU;
    private javax.swing.JLabel CargarFotoDePerfilU;
    private javax.swing.JLabel CargarFotoDePortadaTextU;
    private javax.swing.JLabel CargarFotoDePortadaU;
    private javax.swing.JMenuItem CerrarProgramaU;
    private javax.swing.JMenuItem CerrarSesionU;
    private javax.swing.JLabel ChatTitulo;
    public static javax.swing.JButton ContraseñaEditado;
    public static javax.swing.JPasswordField ContraseñaOcultaUE;
    public static javax.swing.JTextField ContraseñaVisibleEU;
    public static javax.swing.JButton CorreoEditado;
    public static javax.swing.JTextField CorreoElectronicoUE;
    private javax.swing.JLabel CorreoUE;
    private javax.swing.JLabel Cositos;
    private javax.swing.JButton DesAñadir;
    private javax.swing.JLabel DesPer;
    private javax.swing.JLabel DesText;
    private javax.swing.JTextArea DescripcionAU;
    private javax.swing.JButton DescripcionEliminar;
    public static javax.swing.JComboBox<String> DiaUE;
    private javax.swing.JButton DirAñadir;
    private javax.swing.JLabel DirText;
    private javax.swing.JLabel DirUA;
    private javax.swing.JLabel DirUA1;
    private javax.swing.JButton DireccionEliminar;
    private javax.swing.JTextField DireccionUA;
    public static javax.swing.JLabel EdadUE;
    private javax.swing.JLabel EditBtn;
    private javax.swing.JLabel EditBtn2;
    private javax.swing.JPanel EditarPanelUsuario;
    private javax.swing.JButton EditarPost;
    private javax.swing.JPanel Eliminar;
    private javax.swing.JButton EliminarPost;
    public static javax.swing.JComboBox<String> ExtencionUE;
    private javax.swing.JLabel FAñoUE;
    private javax.swing.JLabel FDiaUE;
    private javax.swing.JLabel FMesUE;
    public static javax.swing.JButton FechaEditado;
    private javax.swing.JLabel FondoPosteo;
    private javax.swing.JButton FotoEliminar;
    private javax.swing.JLabel FotoUsuario;
    public static javax.swing.JLabel FotoUsuario2;
    private javax.swing.JLabel FotoUsuario3;
    public static javax.swing.JButton GeneroEditado;
    public static javax.swing.JLabel GeneroUE;
    private javax.swing.ButtonGroup GenerosGroupUE;
    private javax.swing.JButton Gestionar1;
    private javax.swing.JButton Gestionar2;
    private javax.swing.JButton Gestionar3;
    private javax.swing.JButton Gestionar4;
    public static javax.swing.JRadioButton HombreUE;
    private javax.swing.JPanel ImportarPanelUsuario;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel Informacion;
    private javax.swing.JLabel Informacion1;
    private javax.swing.JLabel Informacion2;
    private javax.swing.JLabel Informacion3;
    private javax.swing.JLabel Informacion4;
    public static javax.swing.JButton IngresarAñoUE;
    private javax.swing.JMenuBar MenuBarUsuario;
    public static javax.swing.JComboBox<String> MesUE;
    public static javax.swing.JRadioButton MujerUE;
    public static javax.swing.JButton NomEditador;
    private javax.swing.JLabel NomUE;
    public static javax.swing.JTextField NombreUE;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JPanel PanelAmigos;
    private javax.swing.JPanel PanelChat;
    private javax.swing.JPanel PanelMensajes;
    private javax.swing.JPanel PerfilPanelUsuario;
    private javax.swing.JTabbedPane PestanasChat;
    private javax.swing.JTabbedPane PestañasUsuario;
    private javax.swing.JButton PortadaEliminar;
    private javax.swing.JLabel PortadaUsuario;
    public static javax.swing.JLabel PortadaUsuario2;
    private javax.swing.JLabel PortadaUsuario3;
    private javax.swing.JButton Post;
    private javax.swing.JTextArea Posteados;
    private javax.swing.JTextArea Postear;
    private javax.swing.JButton PostearPost;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Regresar2;
    private javax.swing.JButton Regresar3;
    private javax.swing.JButton Regresar4;
    private javax.swing.JLabel SeguridadUE1;
    public static javax.swing.JButton SeleccionarAñoUE;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator Separador3;
    private javax.swing.JSeparator Separador4;
    public static javax.swing.JTextField SgUE;
    private javax.swing.JLabel SloText;
    public static javax.swing.JButton SloganEditado;
    private javax.swing.JButton SloganEliminar;
    private javax.swing.JLabel SloganUE;
    private javax.swing.JTextField SloganUsuario;
    private javax.swing.JButton TelAñadir;
    private javax.swing.JLabel TelText;
    private javax.swing.JLabel TelUA;
    private javax.swing.JButton TelefonoEliminar;
    private javax.swing.JTextField TelefonoUA;
    public static javax.swing.JComboBox<String> TipoCorreoUE;
    private javax.swing.JLabel UsuarioBanner;
    private javax.swing.JLabel UsuarioBannerAñadir;
    private javax.swing.JLabel UsuarioBannerEditar;
    private javax.swing.JLabel UsuarioBannerEliminar;
    private javax.swing.JLabel UsuarioBannerImportar;
    private javax.swing.JMenu UsuarioMenuUsuario;
    private javax.swing.JLabel ValidarCantidadDeContraseñaUE;
    private javax.swing.JTextField VisualizarContraseñaUE;
    private javax.swing.JButton button4;
    private javax.swing.JButton buttonSig2;
    private javax.swing.JButton buttonSig3;
    private javax.swing.JLabel chatEmoji;
    private javax.swing.JButton chatEnviar;
    private javax.swing.JTextField chatMensaje;
    private javax.swing.JLabel correoUsuario;
    private javax.swing.JLabel iconChats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
