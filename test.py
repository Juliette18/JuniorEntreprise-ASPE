# -*- coding: utf-8 -*-
"""
Created on Fri Apr 12 08:29:23 2019

@author: Juliette
"""

import kivy
from kivy.app import App
kivy.require("1.8.0")
from kivy.uix.label import Label

class SimpleKivy(App):
    def build (self):
        return Label(text="hello world")

if __name__ =="__main__":
    SimpleKivy().run()
    
    
    
    
    
        
