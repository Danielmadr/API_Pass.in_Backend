# Pass.in - Gestão de Participantes em Eventos Presenciais

O **Pass.in** é uma aplicação para gerenciar participantes em eventos presenciais. Ele permite que organizadores criem eventos, inscrevam participantes e facilitem o check-in no dia do evento.

## Funcionalidades
1. **Inscrição de Evento**:
    - O organizador pode cadastrar um evento.

2. **Cadastro de Participantes**:
    - O organizador pode cadastrar novos participantes.
    - Os participantes só podem se inscrever uma vez em um evento.

3. **Visualização de Dados do Evento**:
    - O organizador pode ver detalhes do evento, como data, local, palestrantes etc.

4. **Lista de Participantes**:
    - O organizador tem acesso à lista completa de participantes inscritos.

5. **Crachá de Inscrição**:
    - Os participantes inscritos podem emitir um crachá de inscrição.

6. **Check-in no Dia do Evento**:
    - O sistema permite o check-in dos participantes no dia do evento.
    - O check-in pode ser realizado através de um QRCode.

## Regras de Negócio

- Os participantes só podem se inscrever uma vez em um evento.
- A inscrição só é permitida em eventos com vagas disponíveis.
- O check-in só pode ser feito uma única vez por participante.

## Tecnologias Utilizadas
[comment]: <- **Frontend**: (Liste as tecnologias/frameworks utilizados no frontend) >
- **Backend**: Java com **Spring Boot**
- **Banco de Dados**: **HSQLDB** (local)

## Como Executar o Projeto

1. Clone este repositório.
2. Instale as dependências necessárias.
3. Execute o servidor backend.
4. Execute o servidor frontend.
5. Acesse a aplicação no navegador.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Créditos

Este projeto foi desenvolvido com base no tutorial oferecido pela Rocketseat durante o evento NJW Unite. Agradecemos à equipe da Rocketseat por fornecer recursos valiosos e conhecimento técnico.

Instrutora responsável pelo tutorial:

Fernanda Kipper

***

# Pass.in - Participant Management for In-person Events

Pass.in is an application designed to manage participants for in-person events. It allows organizers to create events, register participants, and facilitate check-in on the event day.

## Features
Event Registration:
- Organizers can create an event.
  
Participant Registration:
- Organizers can register new participants.
- Participants can only register once for an event.

Event Details View:
- Organizers can view event details such as date, location, speakers, etc.

Participant List:
- Organizers have access to a complete list of registered participants.

Registration Badge:
- Registered participants can generate a registration badge.

Event Day Check-in:
- The system allows participants to check-in on the event day.
- Check-in can be done using a QR code.

## Business Rules
- Participants can only register once for an event.
- Registration is allowed only for events with available slots.
- Check-in can only be performed once per participant.

## Technologies Used
Backend: Java with Spring Boot
Database: HSQLDB (local)

## How to Run the Project
1. Clone this repository.
2. Install necessary dependencies.
3. Run the backend server.
4. Run the frontend server.
5. Access the application in the browser.

## Contribution
Contributions are welcome! Feel free to open issues or send pull requests.

## Credits
This project was developed based on the tutorial offered by Rocketseat during the NJW Unite event. We appreciate the Rocketseat team for providing valuable resources and technical knowledge.

Tutorial Instructor:
Fernanda Kipper
