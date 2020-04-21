/* Generated by Krell, do not edit by hand */

import React from 'react';
import {
    AppRegistry,
    View,
    Text
} from 'react-native';
import {name as appName} from './app.json';
import {krellUpdateRoot, onKrellReload} from './target/main.js';

/*
 * Establish a root that works for REPL based dev / prod. In the REPL case
 * the real app root will be loaded async. In prod it won't really be async
 * but we want to treat both cases the same.
 */
class KrellRoot extends React.Component {
    constructor(props) {
        super(props);
        this.state = {loaded: false, root: null, tx: 0};
    }

    render() {
        if (!this.state.loaded) {
            let plainStyle = {
                flex: 1,
                alignItems: 'center',
                justifyContent: 'center'
            };
            return (
                <View style={plainStyle}>
                    <Text>Waiting for Krell to load files.</Text>
                </View>
            );
        }
        return this.state.root();
    }

    componentDidMount() {
        let krell = this;
        krellUpdateRoot((appRoot) => {
            krell.setState({root: appRoot, loaded: true});
        });
        onKrellReload(() => {
            krell.setState((state, props) => {
                return {
                    loaded: state.loaded,
                    root: state.root,
                    tx: state.tx+1
                }
            });
        });
    }
}

AppRegistry.registerComponent(appName, () => KrellRoot);
