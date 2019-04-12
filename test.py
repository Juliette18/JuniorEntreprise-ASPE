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

class LoginScreen (GridLayout):
    def __init__(self,**kwargs):
        super(LoginScreen,self).__init__(**kwargs)
        self.cols=2
        self.add_widget(Label(text="Utilisateur:"))
        self.username=TextInput(multiline = False)
        self.add_widget(self.username)
        self.add_widget(Label(text="Mot de passe:"))
        self.password=TextInput(multiline = False, password = True)
        self.add_widget(self.password)
        self.add_widget(Label(text="Authentification bifactorielle:"))
        self.tfa=TextInput(multiline = False)
        self.add_widget(self.tfa)
    

class SimpleKivy(App):
    def build (self):
        return LoginScreen()

if __name__ =="__main__":
    SimpleKivy().run()
    
    
    
    
    
        
