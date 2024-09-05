start:
    call printNextLine
    call welcomePrompt
    call userInput
    call compareValue
    jmp continuePrompt
    
welcomePrompt:
    mov ah, 09h
    lea dx, prompt
    int 21h
    ret

userInput:
    mov ah, 01h
    int 21h
    ret    
    
compareValue: 
    sub al, '0'
    cmp al, 5
    
    jl lesserInput
    je equalInput
    jg greaterInput
    
    equalInput:
        call printNextLine
    
        mov ah, 09h
        lea dx, equal
        int 21h
        jmp return
        
    lesserInput:
        call printNextLine
    
        mov ah, 09h
        lea dx, less 
        int 21h
        jmp return
    
    greaterInput:
        call printNextLine
    
        mov ah, 09h
        lea dx, great
        int 21h
        jmp return
        
    return:
        ret 

printNextLine:
    mov ah, 02h
    mov dl, 0xD
    int 21h
        
    mov ah, 02h
    mov dl, 0xA
    int 21h
    ret

continuePrompt:
    call printNextLine

    mov ah, 09h
    lea dx, continue
    int 21h
    
    call userInput
    
    cmp al, 'Y'
    je restart
    cmp al, 'y'
    je restart
    
    jne goodbyePrompt
    
    restart:
        call printNextLine
        jmp start  

goodbyePrompt:
    call clearConsole

    mov ah, 09h
    lea dx, goodbye
    int 21h
    jmp exit

clearConsole:
    mov ah, 00h
    mov al, 03h
    int 10h
    ret

exit:
    mov ah, 4ch
    int 21h
        
prompt: db "Enter a single-digit number [0-9]: $"
continue: db "Would you like to try again? [Y/N]: $"
goodbye: db "Thank you for using the program. Take care! $"
great: db "The input is greater than 5.$"
less: db "The input is less than 5.$"
equal: db "The input is equal to 5.$"

enterKey equ 13 