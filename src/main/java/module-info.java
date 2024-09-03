module saracoglu.intellijgithubdemo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens saracoglu.intellijgithubdemo2 to javafx.fxml;
    exports saracoglu.intellijgithubdemo2;
}