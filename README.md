<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>TODO list</title>
        <style>
            h1 {
                text-align:center;
            }
            h3 {
                text-transform: uppercase;
            }
            ul {
                margin: 0;
                padding: 0;
            }
            ul li {
                cursor: pointer;
                position: relative;
                padding: 12px 8px 12px 40px;
                background: #eee;
                font-size: 18px;
                transition: 0.2s;
            }
            ul li:nth-child(odd) {
                background: #f9f9f9;
            }
            ul li:hover {
                background: #ddd;
            }
        </style>
    </head>
    <body>
        <h1>TODO list</h1>
        <h3>Todo</h3>
        <ul>
            <li>Buy a hat for the bat</li>
            <li>Clear the fogs for the frogs</li>
            <li>Bring a box to the fox</li>
        </ul>
        <h3>Done</h3>
        <ul>
            <li>Put the mittens on the kittens</li>
        </ul>
    </body>
</html>