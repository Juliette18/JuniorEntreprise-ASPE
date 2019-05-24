# -*- coding: utf-8 -*-
"""
Created on Fri Apr 12 08:29:23 2019

@author: Juliette
"""

import kivy
from kivy.app import App
kivy.require("1.8.0")
from kivy.uix.label import Label
from kivy.uix.gridlayout import GridLayout
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button
from kivy.uix.screenmanager import ScreenManager, Screen

class LoginScreen (GridLayout):
    def __init__(self,**kwargs):
        super().__init__(**kwargs)
        self.cols=2
        self.add_widget(Label(text="Utilisateur:"))
        self.username=TextInput(multiline = False)
        self.add_widget(self.username)
        self.add_widget(Label(text="Mot de passe:"))
        self.password=TextInput(multiline = False, password = True)
        self.add_widget(self.password)
#        self.add_widget(Label(text="Authentification bifactorielle:"))
#        self.tfa=TextInput(multiline = False)
#        self.add_widget(self.tfa)
        self.join = Button(text="Connexion")
        self.join.bind(on_press=self.join_button)
        self.add_widget(Label())
        self.add_widget(self.join)   
        
        
        self.forgotpwd=Label(text= "Mot de passe oublié ? Envoyez un email à : jesuisundebileamnesique@je.fr")       

        self.add_widget(self.forgotpwd)

    def join_button (self,instance):           
            
            username = self.username.text
            password = self.password.text
#            tfa = self.tfa.text            
            #print("Bienvenue",username)
            with open("prev_details.csv","w") as f:
                f.write(f"{username,password}")
                
            info = f"Bienvenue {username}"
            je_app.info_page.update_info(info)
            je_app.screen_manager.current ='Info'
        
            
            
            

class Welcome (GridLayout):
    def __init__(self,**kwargs):
        super(Welcome,self).__init__(**kwargs)
        self.rows= 2
        
    
    
   

class SimpleKivy(App):
    def build (self):
        
        self.screen_manager= ScreenManager()
        
        self.connect_page = LoginScreen()
        screen = Screen(name='Connexion')
        screen.add_widget(self.connect_page)
        self.screen_manager.add_widget(screen)
        
        self.info_page = InfoPage()
        screen = Screen(name='Info')
        screen.add_widget(self.info_page)
        self.screen_manager.add_widget(screen)
        
        return self.screen_manager
#        return LoginScreen()
        
class InfoPage (GridLayout):
    
    def __init__(self,**kwargs):
        super().__init__(**kwargs)
        
        self.cols=1
        
        self.message= Label(halign="center", valign="middle",font_size =30)
        
        self.message.bind(width=self.update_text_width)
        
        self.add_widget(self.message)
        
    def update_info(self,message):
        self.message.text=message
        
    def update_text_width(self,*_):
        self.message.text_size =(self.message.width*0.9,None)
        

if __name__ =="__main__":
    je_app= SimpleKivy()
    je_app.run()
    
    
    
    
    
    
        
